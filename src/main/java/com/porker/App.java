package com.porker;

import com.porker.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Aurher:Porker_ZHU
 * @Date:2022/5/1 - 05 - 01 - 21:05
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService=(BookService) ctx.getBean("bookService");
        bookService.save();
    }
}
