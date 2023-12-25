package favourite;

import java.io.IOException; 

import org.apache.tomcat.jakartaee.bcel.classfile.ClassFormatException;

import jakarta.servlet.http.HttpServletRequestWrapper;

import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.PreparedStatement; 
import java.sql.SQLException; 


@jakarta.servlet.annotation.WebServlet("/AddToFavourite") 
public class AddToFavourite extends jakarta.servlet.http.HttpServlet { 
protected void doPost(HttpServletRequestWrapper request, HttpServletRequestWrapper response) throws ClassFormatException, IOException, ClassNotFoundException, SQLException { 
String itemId = request.getParameter("itemId"); 
 
 
// Perform necessary operations to add the item to favorites try { 
// Establish database connection 
Class.forName("com.mysql.jdbc.Driver"); 
Connection connection = 
DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "Malavika@19"); 
 
 
// Prepare SQL statement to insert the favorite crossing 
String sql = "INSERT INTO favourites (id, Name, Address, Landmark, Trainschedule, pname, status) " + 
"SELECT id, Name, Address, Landmark, Trainschedule, pname, status " + 
"FROM adminhome WHERE id = ?"; 
PreparedStatement statement = connection.prepareStatement(sql); statement.setString(1, itemId); 
 
 
// Execute the SQL statement 
int rowsAffected = statement.executeUpdate(); 
 
 
// Close the database connection statement.close(); connection.close(); 
 
 
// Redirect the user back to the user home page response.sendRedirect("userhome.jsp"); 
}
}
