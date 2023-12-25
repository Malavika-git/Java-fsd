package adminlogin;
import java.io.IOException; 

import java.io.PrintWriter;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 



import org.apache.catalina.filters.ExpiresFilter.XHttpServletResponse;
import org.apache.tomcat.jakartaee.bcel.classfile.ClassFormatException;

import jakarta.servlet.http.HttpServletRequestWrapper;  
 
@jakarta.servlet.annotation.WebServlet("/AdminLogin")
public class AdminLogin extends jakarta.servlet.http.HttpServlet 
{
	private static final long serialVersionUID = 1L;
public AdminLogin()
{ 
	super(); 
} 
 
 
 
 
protected void doGet(HttpServletRequestWrapper request, XHttpServletResponse response) throws ClassFormatException, IOException, jakarta.servlet.ServletException { try{ 
PrintWriter out= response.getWriter(); 
Class.forName("com.mysql.cj.jdbc.Driver"); Connection 
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root ","Malavika@19"); 
 
String uname = request.getParameter("uname"); 
String pass = request.getParameter("password"); 
PreparedStatement ps = con.prepareStatement("SELECT uname FROM admin WHERE uname=? AND password=?"); ps.setString(1,uname); ps.setString(2,pass); 
ResultSet rs = ps.executeQuery(); 
if(rs.next()) { 
jakarta.servlet.RequestDispatcher rd = request.getRequestDispatcher("adminhome.jsp"); rd.forward(request, response); 
} else { 
out.println("<font color=red size=4>Login Failed!!!<br>"); out.println("<font color=red size=2>Invalid user name or password<br>"); out.println("<a href=login.jsp>Try Again</a>"); 
} 
}catch (ClassNotFoundException e) 
{e.printStackTrace(); 
} catch (SQLException e) { 
} 
} 
} 
 
