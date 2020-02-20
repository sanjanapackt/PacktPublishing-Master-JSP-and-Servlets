<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<set var="myrollno" value="10000"></set>
<c:if test="${myrollno%5==0}">
<c:out value="My Roll Number is divisible by 5"></c:out>
</c:if> 
