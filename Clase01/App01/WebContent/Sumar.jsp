<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    //variables
    int n1,n2,suma;
    //datos
    n1 = Integer.parseInt(request.getParameter("n1"));
	n2 = Integer.parseInt(request.getParameter("n2"));
	//proceso
	suma=n1+n2;
	
    
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Suma</h1>
<p>Numero 1: <%=n1 %></p>
<p>Numero 2: <%=n2 %></p>
<p>Suma: <%=suma %></p>
</body>
</html>