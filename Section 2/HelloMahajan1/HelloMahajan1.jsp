<html>
<body>
<%-- following is the declaration tag --%>
<%! 
int Num=1000 ;
String Emp_Name="Patrcik ;" ;
int addition(int a, int b)
{
int c=a+b ;
return c ;
}

%>
<%-- following is the expression tag --%>

<%=Num%>
<%=Emp_Name%>
<%=addition(10,90)%>



</body>
</html>