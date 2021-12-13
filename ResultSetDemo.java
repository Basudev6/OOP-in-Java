
package databaseConnection;

import java.sql.*;
public class ResultSetDemo {
    public static void main(String[] args)throws Exception 
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca076","root","");
        
        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = st.executeQuery("select * from student");
        while(rs.next())
        {
            int a = rs.getInt(1);
            String b = rs.getString(2);
            String c= rs.getString(3);
            System.out.println(a+" "+b+" "+c);
            
        }
        st.close();
        con.close();
        
    }
}
