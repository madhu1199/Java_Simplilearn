<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@  taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>  
   
   <h1>  JSTL CORE TAG LIB</h1>  
   
   <c:out value="hello friends"></c:out>
   
   <c:if test=" 5 > 3">
   
   <c:out value="5 Greater than 3"></c:out>
   
   </c:if>
