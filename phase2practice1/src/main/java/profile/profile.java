package profile;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/profile")
public class profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public profile() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        request.getRequestDispatcher("linkk.html").include(request, response);  
          
        HttpSession session=request.getSession(false);  
        if(session!=null){  
        String username=(String)session.getAttribute("username");  
          
        out.print("Hello, "+username+" Welcome to Profile");  
        }  
        else{  
            out.print("Please login first");  
            request.getRequestDispatcher("index.html").include(request, response);  
        }  
        out.close();  
    }  
	}
