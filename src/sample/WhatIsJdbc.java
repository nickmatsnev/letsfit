package sample;

import java.sql.*;  // Using 'Connection', 'Statement' and 'ResultSet' classes in java.sql package

class WhatIsJbdc {   // Save as "JdbcSelectTest.java" (JDK 7 and above)
    public static void main(String[] args) {
        try{
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC","matsnnik","Torvald01");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from player");
            while(rs.next())
                System.out.println(rs.getString("username")+"  "+rs.getString("password")+"  "+
                        rs.getInt("score"));
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}