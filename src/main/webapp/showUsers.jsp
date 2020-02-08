<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Users</title>
</head>
<body>
<table>
    <thead>
        <tr>
            <th>Login</th>
            <th>Password</th>
            <th>Name</th>
            <th>LastName</th>
            <th>PhoneNumber</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>
                <c:out value="${user.login}"/>
            </td>
            <td>
                <c:out value="${user.password}"/>
            </td>
            <td>
                <c:out value="${user.name}"/>
            </td>
            <td>
                <c:out value="${user.lastName}"/>
            </td>
            <td>
                 <c:out value="${user.phoneNumber}"/>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>