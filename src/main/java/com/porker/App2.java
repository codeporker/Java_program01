package com.porker;

import com.porker.dao.BookDao;
import com.porker.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Aurher:Porker_ZHU
 * @Date:2022/5/4 - 05 - 04 - 18:37
 */
public class App2 {
    public static void main(String[] args) {
        //获取Ioc容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
        BookDao bookDao= (BookDao) ctx.getBean("bookDao");
        bookDao.save();
//        BookService bookService = (BookService) ctx.getBean("bookService");
//        bookService.save();
    }
}
