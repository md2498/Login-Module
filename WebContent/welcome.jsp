<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>welcome</title>
</head>
<body bgcolor="cyan">
	<%
	
	/*to delete cache page or not to store  */
	
		response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	
	
		if(session.getAttribute("username")==null)
		{
			response.sendRedirect("login.jsp");
		}
	%>
	<p style="text-align: center;">welcome ${username}  <a href="videos.jsp">videos here</a></p>

		<form action="logout">
		<p style="text-align: center;"><input type="submit" value="logout"></p>
		</form>
</body>
</html>