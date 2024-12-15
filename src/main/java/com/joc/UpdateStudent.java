package com.joc;

import java.sql.Connection;
import java.sql.Statement;

public class UpdateStudent {

    public void update() throws Exception{
        Connection con=JDBCUtil.getConnection();
        Statement st =con.createStatement();
        int fees=60000;
        String sql= "update student1 set fees='"+fees+"' where id="+5;
        int x=st.executeUpdate(sql);
        if (x>0)
            System.out.println("Record Update Succesfully.");
        else
            System.out.println("OOPS Something went wrong");
        JDBCUtil.closeConnection(null,st,con);
    }

    public static void main(String[] args) throws Exception{
        UpdateStudent u=new UpdateStudent();
        u.update();
    }
}
