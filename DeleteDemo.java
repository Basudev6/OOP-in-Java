
package databaseConnection;

import java.sql.*;
public class DeleteDemo {
    public static void main(String[] args) throws Exception
    {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca076","root","");
        
        Statement st = con.createStatement();
        int result = st.executeUpdate("delete from student where id=2");
        System.out.println(result+" rows deleted sucessfully");
        con.close();
        
    }
}
