import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class LoginServlet extends jakarta.servlet.http.HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	  // Hard-coded values for demonstration purposes
        String validEmail = "user@example.com";
        String validPassword = "password123";

        String enteredEmail = request.getParameter("email");
        String enteredPassword = request.getParameter("password");

        if (validEmail.equals(enteredEmail) && validPassword.equals(enteredPassword)) {

     

        
            // Successful login, redirect to dashboard
            response.sendRedirect("dashboard.html");
        } else {
            // Invalid login, forward to error page
            request.getRequestDispatcher("error.html").forward(request, response);
        }
    }
}
