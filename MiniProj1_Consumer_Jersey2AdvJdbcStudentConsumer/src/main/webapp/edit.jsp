<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>
<head>
<div align="center">
<h1 style="color: green">Edit the data and press update</h1>
</head>
<body>
<form action="update" method="POST">
<pre>
ID    : <input type="text" name="sid"  value="${std.stdId }"  readonly="readonly"/>
NAME  : <input type="text" name="stdName"  value="${std.stdName }" />
COURSE: <input type="text" name="stdCourse"  value="${std.stdCourse }"/>
FEE   : <input type="text" name="sfee"  value="${std.stdFee }"/>
	<input type="submit" value="Update"/>
</pre>
<h1><a href="index.jsp">back to home</a></h1>
</body>
</html>