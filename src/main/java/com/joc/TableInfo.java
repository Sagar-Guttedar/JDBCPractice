package com.joc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
/*
public class TableInfo {
    public static void main(String[] args) throws Exception {
        Connection con =JDBCUtil.getConnection();
        Statement st =con.createStatement();
        String sql="select * from student1";

        ResultSet rs=st.executeQuery(sql);
        ResultSetMetaData rsmd =rs.getMetaData();
        for (int i=1; i<rsmd.getColumnCount();i++){
            String colName = rsmd.getColumnName(i);
            String colType=rsmd.getColumnTypeName(i);

            int size=rsmd.getColumnDisplaySize(i);
            System.out.println("Column Name  :"+colName+" Column Type : "+colType+" Column Size  :"+size);
            System.out.println("----------------------------------------------------------------------------");
        }
        JDBCUtil.closeConnection(rs,st,con);
    }
}*/
public class TableInfo{
    public static void main(String[] args) throws Exception {
        Connection con=JDBCUtil.getConnection();
        Statement st=con.createStatement();
        String sql="select * from student1";

        ResultSet rs=st.executeQuery(sql);
        ResultSetMetaData rsmd=rs.getMetaData();

        for (int i=1;i<rsmd.getColumnCount();i++){
            String colName=rsmd.getColumnName(i);
            String colType=rsmd.getColumnTypeName(i);
            int size=rsmd.getColumnDisplaySize(i);

            System.out.println("Column Name :"+colName+" Column Type : "+colType+" Column Size :"+size);
            System.out.println("------------------------");
        }
        JDBCUtil.closeConnection(rs,st,con);
    }
}
















