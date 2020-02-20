package mahajans;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
	response.setContentType("text/html"); 
	PrintWriter out=response.getWriter();
	String uname=request.getParameter("uname") ;
	String pass=request.getParameter("pass") ;
	if (uname.equals("Mahajan") && pass.equals("Computers"))
	{
		Cookie cref=new Cookie("ckname",uname) ;
		cref.setMaxAge(365 * 24 * 60 * 60);
	 response.addCookie(cref);
		out.print("<h2>You have signed in successfully</h2>");
		RequestDispatcher rq=request.getRequestDispatcher("index.jsp") ;
		rq.include(request, response);
	}
	
	else
	{
		out.print("<h2>Your user name password is incorrect...Retry</h2>");
		RequestDispatcher rq=request.getRequestDispatcher("login.html") ;
		rq.include(request, response);
	}
		
	}

}
