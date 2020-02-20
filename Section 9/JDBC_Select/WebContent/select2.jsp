<%@ page import="java.sql.*" %>
 
 <%
 Connection conn ; 
 PreparedStatement pst ;
 ResultSet rs ;
try
{
Class.forName("com.mysql.jdbc.Driver") ; // registeration of driver for MySql
conn=DriverManager.getConnection("jdbc:mysql:///company1","root","");
pst=conn.prepareStatement("select * from managerial") ;
rs=pst.executeQuery() ;
out.print("<table border=1><tr><th>Code</th><th>Name</th><th>Level</th></tr>");
while(rs.next())
{
out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</th></tr>");
 } // end of loop
out.print("</table>");
conn.close() ;

} // end of try block
catch(Exception er)
{
out.print(er) ;	
}
 
 %>
 