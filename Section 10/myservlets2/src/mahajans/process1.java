package mahajans;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class process1
 */
@WebServlet("/process1")
public class process1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public process1() {
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
PrintWriter out=response.getWriter() ;		
String name=request.getParameter("nmtxt");	
		String email=request.getParameter("emtxt");
		String lang=request.getParameter("lang") ;
		out.print("<form action='process2' method='post'>");
		out.println("<input type='text' name='txt1' value='"+name+"'") ;
		out.println("<br><input type='text' name='txt2' value='"+email+"'") ;
		out.println("<br><input type='text' name='txt3' value='"+lang+"'") ;
		out.println("<br><input type='submit' value='Click Me'>") ;
		out.println("</form>") ;
	}

}
