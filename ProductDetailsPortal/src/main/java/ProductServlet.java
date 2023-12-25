import java.io.IOException;

import com.example.ecommerce.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/productServlet")
public class ProductServlet extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String productName = request.getParameter("productName");
    String priceString = request.getParameter("price");
int name=0;
 double price = 0 ;
	// Create a product object with the entered details
    Product product = new Product(productName, price);

    // Store the product in the session
    HttpSession session = request.getSession();
    session.setAttribute("product", product);

    // Forward the request to the second JSP for display
    request.getRequestDispatcher("displayproducts.jsp").forward(request, response);
}
}