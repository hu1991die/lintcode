/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.xml.model;

import com.feizi.xml.config.XmlSetCallBack;
import com.thoughtworks.xstream.XStream;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/10/17 17:03
 * @Package_name com.feizi.xml.model
 */
public class ResourceSetCallBack implements XmlSetCallBack {
    /**
     * @Desc 配置xstream元素及属性
     * @Author feizi
     * @Date 2016/10/17 17:06
     * @param obj
     * @return
     */
    public void config(Object obj) {
        XStream xStream = (XStream)obj;
        xStream.alias("resources", Resources.class);
        xStream.alias("string", String.class);
        xStream.aliasField("string", String.class, "strings");
//        xStream.addImplicitCollection(String.class, "string");
        xStream.useAttributeFor("name", String.class);
    }
}
