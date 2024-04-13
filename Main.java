import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

import javax.sql.*;
import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;
import java.sql.DatabaseMetaData;
import com.mysql.cj.MysqlConnection;

public class Main {
    public static void main(String[] args)
    {
    String url="jdbc:mysql://localhost:3306/advanced_java";
    String uname="root";
    String pwd="123qwe";
    String query="update Student set marks=? where stud_name=?";
    try{
    MysqlConnectionPoolDataSource ds=new MysqlConnectionPoolDataSourceDataSource();
    ds.setURL(url);
    ds.setUser(uname);
    ds.setPassword(pwd);
    Connection c = ds.getConnection();
    DatabaseMetaData d = c.getMetaData();
    System.out.println(d.getDatabaseProductName()+" "+ d.getDatabaseProductVersion()+" "+d.getDriverName()+d.getUserName()+" ");    Statement s=c.createStatement();
    PreparedStatement pstmt=c.prepareStatement(query);
    pstmt.setInt(1,29);
    pstmt.setString(2,"Ravi");
    int rowsEffected=pstmt.executeUpdate();
    System.out.println(rowsEffected);
    ResultSet rs=pstmt.executeQuery("select * from Student");
    System.out.println("stud_id\tstud_name\tmarks");
    while(rs.next())
    
    {
    int stud_id=rs.getInt("stud_id");
    String stud_name=rs.getString("stud_name");
    int marks=rs.getInt("marks");

    System.out.println(stud_id+" "+stud_name+" "+marks+" ");
    }
    rs.close();
    s.close();
    c.close();
    }
    catch(Exception e)
    {
    e.printStackTrace();
    }
}
}