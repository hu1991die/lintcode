/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.xml.model;

import java.io.Serializable;

/**
 * @Desc String节点实体
 * @Author feizi
 * @Date 2016/10/17 16:58
 * @Package_name com.feizi.xml.model
 */
public class String implements Serializable {
    private static final long serialVersionUID = 6679672111458511361L;

    private String name;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
