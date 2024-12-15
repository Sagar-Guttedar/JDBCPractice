package com.joc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDynamicValues {
    int sid;
    String sname;
    float fees;
    Scanner sc = new Scanner(System.in);

    public void insertData() throws Exception{
        System.out.println("Enter student id  :");
        sid =sc.nextInt();
        System.out.println("Enter student name : ");
        sname=sc.next();
        System.out.println("Enter Student fees : ");
        fees=sc.nextFloat();

        Connection con=JDBCUtil.getConnection();
        Statement st=con.createStatement();

        String query="insert into student1 values('"+sid+"','"+sname+"','"+fees+"')";
        int x =st.executeUpdate(query);

        if (x>0)
            System.out.println("Data inserted Successfully");
        else
            System.out.println("OOPS somethng went wrong ");
        JDBCUtil.closeConnection(null,st,con);
    }

    public static void main(String[] args) throws Exception{
        InsertDynamicValues ins=new InsertDynamicValues();
        ins.insertData();
    }

}
