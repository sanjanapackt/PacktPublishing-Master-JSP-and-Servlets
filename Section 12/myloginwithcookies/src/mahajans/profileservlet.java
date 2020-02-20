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
 * Servlet implementation class profileservlet
 */
@WebServlet("/profileservlet")
public class profileservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public profileservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	Cookie arr[]=request.getCookies() ;
	String uname="" ;
	for (Cookie ckvar:arr)
	{
		if (ckvar.getName().equals("ckname"))
		{
			uname=ckvar.getValue() ;
			break ;
		}		
	}
	
	if(uname==null || uname.equals(""))
	{
		out.print("<h2>You are not signed in</h2>");
		RequestDispatcher rq=request.getRequestDispatcher("index.jsp") ;
		rq.include(request, response);
	}
	else
	{
		out.print("<h2>Login Name : "+uname+"<br>");
		out.print("<h2>City : Kurukshetra<br>");
		out.print("<h2>Education Qualification : Master of Computers<br>");
		out.print("<h2>Marital Status : Married<br>");
		RequestDispatcher rq=request.getRequestDispatcher("index.jsp") ;
		rq.include(request, response);
	}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
