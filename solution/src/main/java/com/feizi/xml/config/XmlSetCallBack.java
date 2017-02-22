/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.xml.config;

/**
 * @Desc 用于Xstream的元素属性设置 解析xml文件
 * @Author feizi
 * @Date 2016/10/17 17:06
 * @Package_name com.feizi.xml.config
 */
public interface XmlSetCallBack {
    /**
     * @Desc 配置xstream元素及属性
     * @Author feizi
     * @Date 2016/10/17 17:06
     * @param 
     * @return 
     */
    void config(Object obj);
}