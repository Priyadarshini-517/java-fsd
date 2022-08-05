

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Product
 */
public class Productdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Productdetails() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String id=request.getParameter("id");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Darshini@517");
			PreparedStatement pstmt=con.prepareStatement("select * from productid where prodid=?");
			pstmt.setString(1,id);
			RequestDispatcher rd2 = request.getRequestDispatcher("product.html");
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				out.println("<br/>Product ID : " +rs.getInt("prodid"));
				out.println("<br/>Product Name : " +rs.getString("prodname"));

			}
			else
			{
				out.println("<br/>Failed to Retreive Product Details");
out.println("<br/>Incorrect Product ID!!! Please try by giving another ProductID");
				rd2.include(request, response);    
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
