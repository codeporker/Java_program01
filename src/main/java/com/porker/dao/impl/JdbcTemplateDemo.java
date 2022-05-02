package com.porker.dao.impl;

import Durid.DuridUtils;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @Aurher:Porker_ZHU
 * @Date:2022/5/2 - 05 - 02 - 20:32
 */
public class JdbcTemplateDemo {
    public static void main(String[] args) {
//        DataSource ds = null;
        JdbcTemplate template=new JdbcTemplate(DuridUtils.getDataSource());
        String sql="update account set money=? where id=?";
        int count =template.update(sql,11,1);
        System.out.println(count);
        System.out.println(" ");

    }
}
