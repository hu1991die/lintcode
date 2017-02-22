/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.xml.config;

import com.thoughtworks.xstream.XStream;

import java.io.File;
import java.io.InputStream;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/10/17 17:07
 * @Package_name com.feizi.xml.config
 */
public class XmlXStreamParser {

    /**
     * @Desc 把java对象转换成字符串
     * @Author feizi
     * @Date 2016/10/17 17:09
     * @param 
     * @return 
     */
    public String toXML(Object obj){
        XStream xStream = new XStream();
        return xStream.toXML(obj);
    }

    /**
     * @Desc 把xml串转换成java对象
     * @Author feizi
     * @Date 2016/10/17 17:12
     * @param 
     * @return 
     */
    public <T> T fromXML(String xml, Class<T> cls, XmlSetCallBack set){
        XStream xStream = new XStream();
        set.config(xStream);
        return (T) xStream.fromXML(xml);
    }

    /**
     * @Desc 把xml文件转换成java对象
     * @Author feizi
     * @Date 2016/10/17 17:15
     * @param 
     * @return 
     */
    public <T> T fromXML(File file, Class<T> cls, XmlSetCallBack set){
        XStream xStream = new XStream();
        set.config(xStream);
        return (T) xStream.fromXML(file);
    }

    /**
     * @Desc 把输入流转换成java对象
     * @Author feizi
     * @Date 2016/10/17 17:17
     * @param 
     * @return 
     */
    public <T> T fromXML(InputStream ins, Class<T> cls, XmlSetCallBack set){
        XStream xStream = new XStream();
        set.config(xStream);
        return (T) xStream.fromXML(ins);
    }
}
