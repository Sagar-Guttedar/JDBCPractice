package com.joc;

import java.sql.*;

public class JDBCUtil {
    public static Connection getConnection() {
        Connection con;
        try {
            //Step 1: Registering the driver
            Class.forName("com.mysql.jdbc.Driver");
            // step 2 : Establishing connection to the java program
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/joctopus","root","root");
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return con;
    }

    public static void closeConnection(ResultSet rs, Statement st, Connection con){
        try {
            if (rs != null)
                rs.close();
            if (st != null)
                st.close();
            if (con != null)
                con.close();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

}

