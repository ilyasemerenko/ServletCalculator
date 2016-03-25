<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
</head>
<body>
<c:forEach items="${users}" var="user">
    <c:if test = "${user.age < 18}">
        <c:out value = "${user.name} is too young"/>
        <br/>
</c:if>
    </c:forEach>
</body>
</html>
