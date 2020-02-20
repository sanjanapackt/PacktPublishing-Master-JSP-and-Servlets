<html>
<body>
<%-- following is the expression tag using getParameter method --%>
<b> Firtsname : <%=request.getParameter("firstname") %> 
    LastName  : <%=request.getParameter("lastname") %>
    Emai Id   : <%=request.getParameter("emailId") %>
</b>
</body>


</html>