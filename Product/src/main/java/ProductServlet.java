import java.io.IOException;	
	
	
import java.io.PrintWriter;	
import java.net.http.HttpResponse;	
import java.sql.Connection;	
import java.sql.DriverManager;	
import java.sql.PreparedStatement;	
import java.sql.ResultSet;	
import org.apache.tomcat.jakartaee.bcel.classfile.ClassFormatException;	
	
import jakarta.servlet.annotation.WebServlet;	
import jakarta.servlet.http.HttpServlet;	
import jakarta.servlet.http.HttpServletRequest;	
import jakarta.servlet.http.HttpServletRequestWrapper;	
import jakarta.servlet.http.HttpServletResponse;	
	
@WebServlet("/ProductServlet")	
public class ProductServlet extends HttpServlet {	
    private static final long serialVersionUID = 1L;	
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 	
            throws ClassFormatException, IOException {	
        String productId = request.getParameter("productId");	
	
        // JDBC connection and query	
        try {	
        	
        	Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "Malavika@19");
            
            String query = "SELECT * FROM product WHERE product_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement("select *from product where pid=?");
            preparedStatement.setString(2, productId);
        
            ResultSet resultSet = preparedStatement.executeQuery();
            
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            
            if (resultSet.next()) {
                
            	out.println("<h1>Product Details:</h2>");
                out.println("<p>ID: " + resultSet.getString("product_id") + "</p>");
                out.println("<p>Name: " + resultSet.getString("product_name") + "</p>");
                out.println("<p>Price: " + resultSet.getString("product_price") + "</p>");
                
            } else {
                // Display error message
                out.println("<h1>Error: Product not found</h2>");
            }

            connection.close();



	
                 
        } catch (Exception e) {	
            e.printStackTrace();	
        }	
    }	
}	


