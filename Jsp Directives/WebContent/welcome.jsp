<%@ page language="java" info="this is welcome jsp"  contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true"  isThreadSafe="false"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
       welcome first</h1>
       
       <%   /*  RequestDispatcher rd =    request.getRequestDispatcher("hello.jsp"); 
       
      rd.forward(request, response);
      
      */   
       %>
       
       <%@   include file ="hello.jsp" %>
</body>
</html>