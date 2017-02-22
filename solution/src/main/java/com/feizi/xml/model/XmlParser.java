/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.xml.model;

import com.feizi.xml.config.XmlXStreamParser;
import com.feizi.xml.util.PropertiesUtil;

import java.io.InputStream;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/10/17 17:00
 * @Package_name com.feizi.xml.model
 */
public class XmlParser {
    private static Resources resources = null;

    public static Resources getResources(){
        if(resources != null){
            return resources;
        }
        XmlXStreamParser xmlXStreamParser = new XmlXStreamParser();
        InputStream is = PropertiesUtil.class.getResourceAsStream("/app.xml");
        resources = xmlXStreamParser.fromXML(is, Resources.class, new ResourceSetCallBack());
        return resources;
    }
}
