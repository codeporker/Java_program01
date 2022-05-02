package com.porker.dao.impl;

import JDBC.JDBCUtils;

import java.sql.*;

/**
 * @Aurher:Porker_ZHU
 * @Date:2022/5/2 - 05 - 02 - 18:38
 */
public class JDBCDemo1 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "insert into account values(51,'zhu',1)";
            stmt = conn.createStatement();
            int count = stmt.executeUpdate(sql);
            System.out.println(count);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(stmt,conn);
        }


    }
}
