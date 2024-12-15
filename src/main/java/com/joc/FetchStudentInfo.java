package com.joc;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchStudentInfo {
    public static void main(String[] args) throws Exception{
        Connection con = JDBCUtil.getConnection();
        Statement st = con.createStatement();
        String qu ="select * from student1";
        ResultSet rs = st.executeQuery(qu);
        while(rs.next()){
            int id= rs.getInt(1);
            String n=rs.getString(2);
            float f = rs.getFloat(3);
            System.out.println("Student Id : "+id+" Name : "+n+" Fees : "+f);
            System.out.println("-------------------------------------------");
        }
        JDBCUtil.closeConnection(rs,st,con);
    }
}