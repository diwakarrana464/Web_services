<%@page isELIgnored="false" %>
<html>
<body>
<div align="center">
<H3>WELCOME TO STUDENT REGISTER PAGE</H3>
<jsp:include page="header.jsp"></jsp:include>
<form action="insert" method="POST">
<pre>
ID    : <input type="text" name="sid"/>
NAME  : <input type="text" name="stdName"/>
COURSE: <input type="text" name="stdCourse"/>
FEE   : <input type="text" name="sfee"/>
	<input type="submit" value="Register"/>
</pre>
${message}
</form>
</div>
<div align="center">
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
