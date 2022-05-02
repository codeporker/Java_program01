package com.porker.dao.impl;

import Durid.DuridUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Aurher:Porker_ZHU
 * @Date:2022/5/2 - 05 - 02 - 19:45
 */
public class JDBCDemo02 {
    public static void main(String[] args) {
//        Connection conn=null;
//        PreparedStatement pstmt=null;
//        try {
//            conn = DuridUtils.getConnection();
//            String sql="insert into account values(?,?,?)";
//            pstmt=conn.prepareStatement(sql);
//            pstmt.setInt(1,99);
//            pstmt.setString(2,"po");
//            pstmt.setInt(3,88);
//            int count = pstmt.executeUpdate();
//            System.out.println(count);
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            DuridUtils.close(pstmt,conn);
//        }
    }

}
