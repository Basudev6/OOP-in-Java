
package databaseConnection;

import java.sql.*;
public class PreparedStatementInsert {
    public static void main(String args[])throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca076","root","");
        
        PreparedStatement pst = con.prepareStatement("insert into student value(?,?,?)");
        
        pst.setInt(1,26);
        pst.setString(2,"Sandesh");
        pst.setString(3,"chitwan");
        
        pst.executeUpdate();
        pst.close();
        con.close();
        
    }
}
