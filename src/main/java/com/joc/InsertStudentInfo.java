package com.joc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStudentInfo {

    public static void main(String[] args) {

        try {
            System.out.println("Inserting the data into table");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/joctopus","root", "root");
            Statement st = con.createStatement();
            String query="insert into student1 values(1,'ABC',45000)";
            int x =st.executeUpdate(query);
            if(x>=1)
                System.out.println("Data inserted successfully..!");
            else
                System.out.println("OOPS something went wrong");

            st.close();
            con.close();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
    }
    }
}
