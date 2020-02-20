<%@ page import="java.util.*" %>
<html>
<body>
<h1> Declaration Tag</h1>
<%! int age=22; 
    String name="Anand Mahajan" ;

%>
<h1> Expression Tag </h1>
Name Is : <%="<b><u>"+name+"</u></b>" %>
Age is  : <%="<b><u>"+age+ "</u></b>"  %>
<h1> Scriptlet Tag</h1>
<% Date Today_Date=new Date(); 
out.println("Today's date is "+Today_Date) ;
out.println("<h2>www.youtube.com/mahajancomputerskkr</h2>") ;
%>

</body>


</html>