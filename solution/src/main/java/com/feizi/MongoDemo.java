/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi;

import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/9/24 20:30
 * @Package_name com.feizi
 */
public class MongoDemo {
    public static void main(String[] args) {
        try {
            // 连接到 mongodb 服务
            MongoClient mongoClient = new MongoClient( "127.0.0.1" , 27017 );

            // 连接到数据库
            MongoDatabase mongoDatabase = mongoClient.getDatabase("fastdfsstore");
            System.out.println("Connect to database successfully");

            MongoCollection<Document> collection = mongoDatabase.getCollection("docConvertProcess");
            System.out.println("集合 docConvertProcess 选择成功");

            FindIterable<Document> findIterable = collection.find();
            MongoCursor<Document> mongoCursor = findIterable.iterator();

            Document document = null;
            while(mongoCursor.hasNext()){
                document  = mongoCursor.next();
                Object key = document.get("_id");
                String swfStr = (String) document.get("swf");
                if(!swfStr.startsWith("http/")){
                    swfStr = "http/" + swfStr;
                    collection.updateOne(Filters.eq("_id", key), new Document("$set",new Document("swf",swfStr)));
                    System.out.println(swfStr);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
