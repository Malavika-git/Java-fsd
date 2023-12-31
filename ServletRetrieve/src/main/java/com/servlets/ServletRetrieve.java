package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import org.apache.tomcat.jakartaee.bcel.classfile.ClassFormatException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;	
import jakarta.servlet.http.HttpServlet;	
import jakarta.servlet.http.HttpServletRequest;	
import jakarta.servlet.http.HttpServletRequestWrapper;	
import jakarta.servlet.http.HttpServletResponse;	
	

/**
 * Servlet implementation class ServletRetrieve
 */
public class ServletRetrieve extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletRetrieve() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		String productId = request.getParameter("pid");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "Malavika@19");
			PreparedStatement ps = conn.prepareStatement("select * from product where pid=?");
			ps.setString(1, productId);
			
			pw.print("<table width=50% border=1>");
			pw.print("<caption>Product Details are: </caption>");
			
			ResultSet rs = ps.executeQuery();
			
//			Printing column names
			pw.print("</br></br>");
			ResultSetMetaData rsmd = rs.getMetaData();
			int total = rsmd.getColumnCount();
			
			pw.print("<tr>");
			for(int i = 1; i <= total; i++) {
				pw.print("<th>" + rsmd.getColumnName(i) + "</th>");
			}
			pw.print("</tr>");
			
//			Printing the results
			while(rs.next()) {
				pw.print("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(2)
				+ "</td><td>" + rs.getInt(3) + "</td></tr>");
			}
			pw.print("</table>");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}
		
	}

}