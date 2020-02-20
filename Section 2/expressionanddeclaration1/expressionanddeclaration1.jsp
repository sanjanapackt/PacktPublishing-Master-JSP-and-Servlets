<html>
<body>
<%-- Following is the declaration tag --%>
<%!
int Cube(int Num)
{
int Cb ;
Cb=Num * Num * Num ;
return Cb ;
}

%>
<%-- following is the expression tag --%>
<%=Cube(10) %>
<%=Cube(15) %>


</body>

</html>