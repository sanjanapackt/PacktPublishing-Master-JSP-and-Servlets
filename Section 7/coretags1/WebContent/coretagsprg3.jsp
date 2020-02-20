<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var="rollno" begin="500" end="10000" step="500">
<c:out value="${rollno}"> </c:out>

</c:forEach>
