<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.DriverManager" %>
<%
Connection conn ;
PreparedStatement pst ;
try
{
Class.forName("com.mysql.jdbc.Driver") ;
conn=DriverManager.getConnection("jdbc:mysql:///employees","root","") ;
String sql="insert into master (emp_code,emp_name,salary) values(?,?,?)" ;
int ecode=Integer.parseInt(request.getParameter("ecode")) ;
String ename=request.getParameter("ename") ;
float salary=Float.parseFloat(request.getParameter("esalary")) ;
pst=conn.prepareStatement(sql) ;
pst.setInt(1,ecode) ;
pst.setString(2, ename) ;
pst.setFloat(3,salary) ;
pst.execute() ;  // executing SQL statement 
conn.close() ;    // closing the connection
} // end of try block

catch(Exception er)
{
out.print(er) ;	
}
%>
