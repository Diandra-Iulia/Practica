<% int fontSize; %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>Welcome <%=(String)request.getAttribute("Username")%> </h1>
	
<p>
   Today's date: <%= (new java.util.Date()).toLocaleString()%>
</p>	
<% 
	for(fontSize=1; fontSize<5; fontSize++){%>
		<font color=blue size="<%=fontSize %>">
		
		JSP font
		</font><%} %>
	<form action="logout" method=post>
	<button type=submit>Log out</button>
	</form>
</body>
</html>