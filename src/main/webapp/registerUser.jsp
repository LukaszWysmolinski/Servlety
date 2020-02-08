<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h1>Register User</h1>

<form action="registerUser" method="POST">
    Login <input type="text" name="login"/><br>
    Password <input type="password" name="password"/><br>
    ConfirmPassword <input type="password" name="confirmPassword"/><br>
    Name <input type="text" name="name"/><br>
    LastName <input type="text" name="lastName"/><br>
    PhoneNumber <input type="text" name="phoneNumber"/><br>
    <input type="submit" value="Register">
    <c:if test="${param.hasErrors == 'true'}">
        <br/>
        Validation failed
   </c:if>
</form>

</body>
</html>


