package com.porker.service.impl;

import com.porker.dao.BookDao;
import com.porker.dao.impl.BookDaolmpl;
import com.porker.service.BookService;

import java.lang.invoke.VarHandle;

/**
 * @Aurher:Porker_ZHU
 * @Date:2022/5/1 - 05 - 01 - 21:01
 */
public class BookServicelmpl implements BookService {
    //删除业务层中使用new的方式创建的dao对象
    private BookDao bookDao;

    public void save() {
        bookDao.save();
        System.out.println("book service save ...");
    }

    //提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
