package com.porker.dao.impl;

import com.porker.dao.BookDao;

/**
 * @Aurher:Porker_ZHU
 * @Date:2022/5/1 - 05 - 01 - 21:00
 */
public class BookDaolmpl implements BookDao {
    public void save(){
        System.out.println("book dao save ...");
    }
    public void init(){
        System.out.println("init...");
    }
    public void destory(){
        System.out.println("destory..");
    }
}
