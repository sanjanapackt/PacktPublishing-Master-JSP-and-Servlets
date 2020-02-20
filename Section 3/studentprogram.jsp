<%@ page import="mahajan1.*" %>
<html>
<body>
<!--  following is the Scriptlet tag -->
<%
Students er=new Students(10001,90.99f,90,76.00f) ;
float Per=er.Percentage() ;
out.println("<b>Percentage = "+Per+"</b>") ;

%>

</body>

</html>