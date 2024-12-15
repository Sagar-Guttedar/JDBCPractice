package com.joc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
public class PreparedEx {
    int id;
    String name,decider;
    float fees;

    Scanner sc=new Scanner(System.in);

    public void insertData() throws Exception{
        Connection con =JDBCUtil.getConnection();
        PreparedStatement psmt=con.prepareStatement("insert into student1 values(?,?,?)");

        do {
            System.out.println("Enter Student id : ");
            id=sc.nextInt();
            System.out.println("Enter Student name : ");
            name=sc.next();
            System.out.println("Enter Student Fees :");
            fees=sc.nextFloat();

            psmt.setInt(1,id);
            psmt.setString(2,name);
            psmt.setFloat(3,fees);

            int x=psmt.executeUpdate();
            if (x>0)
                System.out.println("Record inserted SuccessFully.");
            else
                System.out.println("OOPS something went wrong.");
            System.out.println("Do you want insert another record.");
            decider=sc.next();
        }
        while (decider.equalsIgnoreCase("yes"));

        JDBCUtil.closeConnection(null,psmt,con);
    }

    public static void main(String[] args) throws Exception{
        PreparedEx p=new PreparedEx();
        p.insertData();
    }
}
*/

public class PreparedEx{
    int id;
    String name,decider;
    float fees;

    Scanner sc=new Scanner(System.in);

    public void insertData() throws Exception{
        Connection con=JDBCUtil.getConnection();
        PreparedStatement psmt= con.prepareStatement("insert into student1 values(?,?,?)");

        do {
            System.out.println("Enter Student id :");
            id = sc.nextInt();
            System.out.println("Enter Student Name :");
            name = sc.next();
            System.out.println("Enter student fees : ");
            fees = sc.nextFloat();

            psmt.setInt(1, id);
            psmt.setString(2, name);
            psmt.setFloat(3, fees);

            int x = psmt.executeUpdate();

            if (x > 0) {
                System.out.println("Record inserted Successfulyy.");
            }else{
                System.out.println("OOPS some went wrong");
            }
            System.out.println("Do you want to insert another record");
            decider=sc.next();
        }while(decider.equalsIgnoreCase("yes"));
        JDBCUtil.closeConnection(null,psmt,con);
    }

    public static void main(String[] args) throws Exception {
        PreparedEx p=new PreparedEx();
        p.insertData();
    }

}















