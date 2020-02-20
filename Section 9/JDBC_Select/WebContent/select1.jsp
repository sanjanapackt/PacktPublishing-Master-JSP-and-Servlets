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

while(rs.next())
{
out.print(rs.getInt(1)+"       "+rs.getString(2)+"      "+rs.getString(3));
out.print("</br>");
} // end of loop
 
conn.close() ;

} // end of try block
catch(Exception er)
{
out.print(er) ;	
}
 
 %>
 