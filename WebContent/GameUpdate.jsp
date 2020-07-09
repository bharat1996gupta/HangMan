<%@ page import="requesthandler.Logic"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
button
{
	padding : 25px;
	margin : 5px;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>HANG MAN GAME</h1>
<br><br><br>
<% 
for(int i = 0; i < Logic.getWordToGuess().length; i++)
	{
%>
<span><%= Logic.getWordToGuess()[i] + " " %></span>
<%
	}
%>
<br><br><br><form method = "post">
<%
for(int i = 65; i < 91; i++)
{
%>
<button type="submit" formaction = "requestHandler?character=<%=(char)(i)%>"><%= (char)(i) %></button>
<%
	if((i - 64) % 12 == 0)
	{ 
%>
<br>
<%
	}
}
%>
<p>Number of Attempts : <%= Logic.getWorngAttempts() %></p>
</form>
</body>
</html>