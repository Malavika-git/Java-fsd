package register;

import java.lang.reflect.Member;
import java.sql.Connection; import java.sql.DriverManager; import java.sql.PreparedStatement; import java.sql.SQLException;

import org.apache.catalina.tribes.membership.StaticMember; 


public class RegisterDao { 
 
private static final String member = null;
private static String dbUrl = "jdbc:mysql://localhost:3306/railway"; 
private static String dbUname = "root";
private static String dbPassword = "Malavika@19";
private static String dbDriver = "com.mysql.cj.jdbc.Driver"; 
 
public static void loadDriver(String dbDriver) 
{ try 
{ Class.forName(dbDriver); 
} catch (ClassNotFoundException e) { // TODO Auto-generated catch block e.printStackTrace(); 
} 
} 
 
public static Connection getConnection() 
{ 
Connection con = null;
try {
	try {
		con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} return con; 
} 
 
 

public static String insert (Member user) 
{
loadDriver(dbDriver); 
Connection con = getConnection(); 
String result = "Data entered successfully"; 
String sql = "insert into user values(?,?,?)"; 
 
PreparedStatement ps; try { 
ps = con.prepareStatement(sql); 
ps.setString(1, member.getUname());
ps.setString(2, member.getPassword());
ps.setString(3, member.getEmail()); 
ps.executeUpdate(); 
} catch (SQLException e) { // TODO Auto-generated catch block
	e.printStackTrace();
	result = "Data not entered"; 
} return result; 
} 

 
  
} 
 

 
