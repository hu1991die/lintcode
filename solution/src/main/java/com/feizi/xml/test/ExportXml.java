/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.xml.test;

import com.feizi.xml.model.Resources;
import com.feizi.xml.model.XmlParser;

import java.util.List;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/10/17 17:42
 * @Package_name com.feizi.xml.test
 */
public class ExportXml {
    public static void main(String[] args) {
        //解析配置文件
        Resources resources = XmlParser.getResources();

        List<String> strings = null;
        if(null != resources){
            System.out.println(resources);
        }
    }
}
