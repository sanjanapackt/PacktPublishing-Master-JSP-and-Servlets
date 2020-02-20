 <html>
 <body>
 <% 
 int c ;
for (c=1000;c>=500;c-=100)
{
out.println("<b>c = "+c+"</b>") ;	
}
%>
  <% if(c!=400){ %>
  <jsp:forward page="process.jsp"></jsp:forward>  
  <%} else {%>
  <jsp:include page="process2.jsp"></jsp:include>
  <%}%>
 </body>
 </html>