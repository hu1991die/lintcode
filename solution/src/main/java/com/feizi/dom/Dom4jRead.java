/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.dom;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.Iterator;
import java.util.List;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/10/17 18:04
 * @Package_name com.feizi.dom
 */
public class Dom4jRead {
    private Document document;

    @Before
    public void setUp() throws DocumentException {
        document = new SAXReader()
                .read(ClassLoader.getSystemResource("exception-message.xml"));
    }

    public void writeTxt(String fileName){
        Element resources = document.getRootElement();

        FileWriter fw = null;
        try {
            fw = new FileWriter(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Iterator iterator = resources.elementIterator(); iterator.hasNext(); ) {
            Element string = (Element) iterator.next();
            String description = string.getTextTrim();
            System.out.println(description);
            try {
                fw.write(description + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @Desc 要生成的Excel文件名
     * @Author feizi
     * @Date 2016/10/17 18:52
     * @param
     * @return
     */
    public void writeToExcel(String fileName){
        Element resources = document.getRootElement();

        WritableWorkbook wwb = null;
        try {
            //首先要使用Workbook类的工厂方法创建一个可写入的工作薄(Workbook)对象
            wwb = Workbook.createWorkbook(new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(wwb != null){
            //创建一个可写入的工作表
            //Workbook的createSheet方法有两个参数，第一个是工作表的名称，第二个是工作表在工作薄中的位置
            WritableSheet ws = wwb.createSheet("sheet1", 0);
            int i=0;
            for (Iterator iterator = resources.elementIterator(); iterator.hasNext(); ) {
                Element string = (Element) iterator.next();
                String description = string.getTextTrim();
                Label label = new Label(0, i, description);
                System.out.println(description);
                try {
                    ws.addCell(label);
                } catch (WriteException e) {
                    e.printStackTrace();
                }
                i++;
            }

            try {
                //从内存中写入文件中
                wwb.write();
                //关闭资源，释放内存
                wwb.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (WriteException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeExcelOfException(String fileName){
        Element resources = document.getRootElement();

        WritableWorkbook wwb = null;
        try {
            //首先要使用Workbook类的工厂方法创建一个可写入的工作薄(Workbook)对象
            wwb = Workbook.createWorkbook(new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(wwb != null){
            //创建一个可写入的工作表
            //Workbook的createSheet方法有两个参数，第一个是工作表的名称，第二个是工作表在工作薄中的位置
            WritableSheet ws = wwb.createSheet("sheet1", 0);
            int i=0;
            for (Iterator iterator = resources.elementIterator(); iterator.hasNext(); ) {
                Element message = (Element) iterator.next();
                String code = message.attributeValue("code");
                String msg = message.attributeValue("msg");
                Label label1 = new Label(0, i, code);
                Label label2 = new Label(1, i, msg);
                System.out.println(msg);
                try {
                    ws.addCell(label1);
                    ws.addCell(label2);
                } catch (WriteException e) {
                    e.printStackTrace();
                }
                i++;
            }

            try {
                //从内存中写入文件中
                wwb.write();
                //关闭资源，释放内存
                wwb.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (WriteException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            Dom4jRead dom4jRead = new Dom4jRead();
            dom4jRead.setUp();
            dom4jRead.writeExcelOfException("F:\\exception.xls");
//            dom4jRead.writeTxt("F:\\app_messages.txt");
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
