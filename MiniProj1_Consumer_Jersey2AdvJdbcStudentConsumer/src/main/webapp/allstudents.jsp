<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<div align="center">
<jsp:include page="header.jsp"></jsp:include>
<h1></h1><div>.....All Students are following....</div></h1>
</head>
<body>
<table border="1">
<tr>
<th>ID</th>
<th>Name</th>
<th>Course</th>
<th>Fee</th>
<th>DisCount</th>
<th colspan="2">links</th>
</tr>
<c:forEach items="${studentList}" var="std"><tr>
<th>${std.stdId }</th>
<th>${std.stdName }</th>
<th>${std.stdCourse }</th>
<th>${std.stdFee}</th>
<th>${std.stdDiscount }</th>
<th><a href="delete?sid=${std.stdId }">Delete</a></th>
<th><a href="edit?sid=${std.stdId }">Update</a></th>
</tr></c:forEach>
</table>
<h1 style = "color: red ">${resMsg}</h1>
<%-- <h1 style = "color: red ">${resUpdateMsg}</h1> --%>
<h1 ><a href="index.jsp">back to home</a></h1>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>