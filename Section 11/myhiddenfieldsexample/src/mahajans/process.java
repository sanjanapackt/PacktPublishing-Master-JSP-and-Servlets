package mahajans;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class process
 */
@WebServlet("/process")
public class process extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public process() {
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
		//doGet(request, response);
	response.setContentType("text/html");
	String uname=request.getParameter("uname") ;
	String city=request.getParameter("city") ;
	PrintWriter out=response.getWriter();
	out.print("<form method='post' action='sample'>");
	out.print("<input type='hidden' name='txtuname' value='"+uname+"'>");
	out.print("<input type='hidden' name='txtcity' value='"+city+"'>");
	out.print("<input type='submit' value='Proceed'>");
	out.print("</form>");
		
	}

}
