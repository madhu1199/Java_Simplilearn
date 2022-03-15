<%@page import="javax.websocket.Session"%>
<%@ page language="java" isELIgnored="false"  contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=(String) session.getAttribute("uname");

out.print("welcome"+name); 
out.print("<br> page"+page);
   pageContext.setAttribute("data","Jai Balayya");

%><br>

welcome again: <%= session.getAttribute("uname")  %><br>
Context:  <%= application.getAttribute("pwd") %><br>

 This is EL Expression :  ${pwd}<br>
 PageContext: ${data}
 <br>
 <% 
	
	session1 =  session;
	
	RequestDispatcher rd =	request.getRequestDispatcher("/test.jsp");	
		rd.include(request, response);
	
%>


<%! 
	HttpSession session1;
%>
<%= session1 %>

 
</body>
</html>