package com.joc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/*public class DeleteStudent1Info {
    public static void main(String[] args) throws Exception{
        Connection con = JDBCUtil.getConnection();
        Statement st = con.createStatement();
        String qu ="delete from student1 where id="+6;

        int x=st.executeUpdate(qu);

        if(x>0){
            System.out.println("Record deleted Successfully.");
        }else{
            System.out.println("No record found with the specified ID");
        }

        JDBCUtil.closeConnection(null,st,con);
    }
}*/

public class DeleteStudent1Info{
    public static void main(String[] args) throws Exception {
        Connection con = JDBCUtil.getConnection();
        Statement st= con.createStatement();
        String query="Delete from student1 where id="+66;
        int x=st.executeUpdate(query);

        if (x>0){
            System.out.println("Record Deleted Succussfully.");
        }else{
            System.out.println("No record found with the specified id. ");
        }
        JDBCUtil.closeConnection(null,st,con);
    }
}



