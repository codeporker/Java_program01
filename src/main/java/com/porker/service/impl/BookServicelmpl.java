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
//    private BookDao bookDao = new BookDaolmpl();

    public void save() {
//        bookDao.save();
        System.out.println("service out");
    }

}
