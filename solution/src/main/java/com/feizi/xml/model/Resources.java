/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.xml.model;

import java.io.Serializable;
import java.util.List;

/**
 * @Desc String集合
 * @Author feizi
 * @Date 2016/10/17 16:55
 * @Package_name com.feizi.xml.model
 */
public class Resources implements Serializable{
    private static final long serialVersionUID = -1355434489337991112L;

    private List<String> strings;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }
}
