
package databaseConnection;

import java.sql.*;
public class InsertDemo {
    public static void main(String[] args)throws Exception
    {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca076","root","");
        
        Statement st = con.createStatement();
        int result = st.executeUpdate("insert into student values(5,'kumar','Tandi')");
      
        con.close();
        
    }
}
