
<html>
<%-- This program demonstrates how to read from a checkbox --%>
<body>
<%
String fname=request.getParameter("firstname");
String lname=request.getParameter("lastname");
boolean flag=request.getParameter("mar")!=null ;
if (flag==true)
	out.println("<b>"+fname+"\t"+lname+"  is Married</b>") ;
else
	out.println("<b>"+fname+"\t"+lname+"  is Single</b>") ;
%>

</body>
</html>