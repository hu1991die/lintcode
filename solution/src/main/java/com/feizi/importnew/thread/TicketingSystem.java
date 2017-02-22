/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.importnew.thread;

/**
 * @Desc 火车票售票系统模拟程序
 * @Author feizi
 * @Date 2016/10/12 9:46
 * @Package_name com.feizi.importnew.thread
 */
public class TicketingSystem {
    public static void main(String[] args) {
        TicketService ticketService = new TicketService("北京-->赣州", 100);
        TicketSaler ticketSaler = new TicketSaler("售票程序", ticketService);

        System.out.println("各位旅客，目前" + ticketService.getTicketName() + "的车票已经" +
                "开始发售，总共有 " + ticketService.getTotalCount() + " 张票...");

        //创建10个线程，以模拟10个售票窗口
        Thread threads[] = new Thread[8];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(ticketSaler, "窗口" + (i + 1));
            System.out.println("窗口 " + (i + 1) + " 开始出售 " + ticketService.getTicketName()
                + " 的票...");
            threads[i].start();
        }
    }
}

/**
 * @Desc 模拟服务器的类
 * @Author feizi
 * @Date 2016/10/12 9:47
 * @param
 * @return
 */
class TicketService{
    //火车票名程
    private String ticketName;
    //总票数
    private int totalCount;
    //剩余票数
    private int remaining;

    public TicketService(String ticketName, int totalCount) {
        this.ticketName = ticketName;
        this.totalCount = totalCount;
        this.remaining = totalCount;
    }

    /**
     * @Desc 开始售票
     * @Author feizi
     * @Date 2016/10/12 11:15
     * @param
     * @return
     */
    public synchronized int saleTicket(int ticketNum){
        //如果还有余票
        if(remaining > 0){
            remaining -= ticketNum;
            try {
                //暂停0.1秒，模拟真实系统中复杂计算所需的时间
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(remaining >= 0){
                return remaining;
            }else{
                remaining += ticketNum;
                return -1;
            }
        }
        return -1;
    }

    /**
     * @Desc 获取余票数
     * @Author feizi
     * @Date 2016/10/12 11:14
     * @param
     * @return
     */
    public synchronized int getRemaining(){
        return remaining;
    }

    /**
     * @Desc 获取总票数
     * @Author feizi
     * @Date 2016/10/12 11:15
     * @param
     * @return
     */
    public synchronized int getTotalCount(){
        return totalCount;
    }

    /**
     * @Desc 获取车票名称
     * @Author feizi
     * @Date 2016/10/12 11:15
     * @param
     * @return
     */
    public String getTicketName(){
        return this.ticketName;
    }
}

/**
 * @Desc 售票程序
 * @Author feizi
 * @Date 2016/10/12 9:56
 * @param
 * @return
 */
class TicketSaler implements Runnable{

    private String windowName;
    private TicketService ticketService;

    public TicketSaler(String windowName, TicketService ticketService) {
        this.windowName = windowName;
        this.ticketService = ticketService;
    }

    public void run() {
        while (ticketService.getRemaining() > 0){
            synchronized (this){
                System.out.println(Thread.currentThread().getName() + "出售第 "
                        + ticketService.getRemaining() + " 张票...");
                int remaining = ticketService.saleTicket(1);
                if(remaining >= 0){
                    System.out.println("出票成功！剩余 " + remaining + " 张票...");
                }else{
                    System.out.println("出票失败，该票已售罄...");
                }
            }
        }
    }
}
