<html>
<body>
<%-- reading values from HTML controls --%>
<b> The student with name <%=request.getParameter("firstname")%>
<%=request.getParameter("lastname") %>
has opted for the following subject :
<%=request.getParameter("subjects") %>
</b>

</body>


</html>