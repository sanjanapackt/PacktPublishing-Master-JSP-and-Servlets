<html>
<body>
<%-- following is the expression tag using getParameter method --%>
<%--<b>  Firtsname : <%=request.getParameter("firstname") %> 
    LastName  : <%=request.getParameter("lastname") %>
    Emai Id   : <%=request.getParameter("emailId") %>

</b>
--%>
<b>
FirstName : ${param.firstname}
<br>
Last Name : ${param.lastname}
<br>
Email ID  : ${param.emailId}
</b> 
</body>

</html>