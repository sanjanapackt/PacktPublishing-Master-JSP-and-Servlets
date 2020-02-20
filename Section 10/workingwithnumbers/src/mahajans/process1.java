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
     * Default constructor. 
     */
    public process1() {
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
		response.setContentType("text/html") ;
		int num1,num2,num3=0,option ;
	num1=Integer.parseInt(request.getParameter("fnum")) ;
	num2=Integer.parseInt(request.getParameter("snum")) ;
	option=Integer.parseInt(request.getParameter("op")) ;
	PrintWriter out=response.getWriter() ;
	switch(option)
	{
	case 1:
		num3=num1 + num2 ;
		break ;
	case 2:
		num3=num1 - num2 ;
		break ;
	case 3:
		num3=num1 * num2 ;
		break ;
	case 4:
		num3=num1 % num2 ;
		break ;
		default:
			out.println("<b>Invalid Input</b>");
			System.exit(0);
	
	
	} // end of switch case construct
	out.println("<b>The output is : "+num3+"</b>") ;

	
	}

}
