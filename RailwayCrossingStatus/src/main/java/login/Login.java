package login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.io.IOException;
import java.io.PrintWriter; 
import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.sql.SQLException; 
 
 

 
@WebServlet("/Login")
public class Login extends HttpServlet 
{
	private static final long serialVersionUID = 1L; 
 
 
public Login() 
{super(); 
  
} 
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
try { 
PrintWriter out= response.getWriter(); 
Class.forName("com.mysql.jdbc.Driver"); 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Malavika@19"); 
 
 
String uname = request.getParameter("uname"); 
String pass = request.getParameter("password"); 
PreparedStatement ps = con.prepareStatement("SELECT uname FROM user WHERE uname=? AND password=?"); ps.setString(1,uname); ps.setString(2,pass); 
ResultSet rs = ps.executeQuery(); 
 
 if(rs.next()) { 
jakarta.servlet.RequestDispatcher rd = request.getRequestDispatcher("userhome.jsp"); rd.forward(request, response); 
} 
else { out.println("<font color=red size=4>Login Failed!!!<br>"); out.println("<font color=red size=2>Invalid user name or password<br>"); out.println("<a href=login.jsp>Try Again</a>"); 
} 
}catch (ClassNotFoundException e) 
{e.printStackTrace(); 
} catch (SQLException e) { // TODO Auto-generated catch block 
e.printStackTrace(); 
} 
} 
private PreparedStatement prepareStatement(String string) { 
// TODO Auto-generated method stub 
return null; 
}   
}  
