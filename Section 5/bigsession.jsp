<%@ page import="java.io.*,java.util.*" %>
<%
Date createTime = new Date(session.getCreationTime());
Date lastAccessTime = new Date(session.getLastAccessedTime());

   String title = "Welcome Back to Mahajans' Learning Hub";
   Integer visitCount = new Integer(0); 
   String userID=""; 

   // Check if this is new comer on your web page.
   if (session.isNew()){
   title = "Hi ! You are visiting Mahajan Computers for the first time";
   session.setAttribute("userIDKey", "Mahajans");
   session.setAttribute("visitCountKey",  visitCount);
   
   } 
   visitCount = (Integer)session.getAttribute("visitCountKey");
   visitCount++;
   userID = (String)session.getAttribute("userIDKey");
   session.setAttribute("visitCountKey",  visitCount);
%>
<html>
<head>
<title>My Session Tracking Lesson</title>
</head>
<body>
<center>
<h1><%=title%></h1>
</center>
<table border="1" align="center"> 
<tr bgcolor="red">
   <th>Session info</th>
   <th>Value</th>
</tr> 
<tr>
   <td>id</td>
   <td><% out.print(session.getId()); %></td>
</tr> 
<tr>
   <td>Creation Time</td>
   <td><% out.print(createTime); %></td>
</tr> 
<tr>
   <td>Time of Last Access</td>
   <td><% out.print(lastAccessTime); %></td>
</tr> 
<tr>
   <td>User ID</td>
   <td><% out.print(userID); %></td>
</tr> 
<tr>
   <td>Number of visits</td>
   <td><% out.print(visitCount); %></td>
</tr> 
</table> 
</body>
</html>