<%--
Cette JSP accueillera un form avec les deux champs login et password
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>LOGIN</title>
</head>
<body>
<form method="post">
    <label> Login
        <input type="text" name="login">
    </label>
    <br/>
    <label> Mot de Passe
        <input type="password" name="mdp">
    </label>
    <br>
    <button type="submit">Envoyer</button>
</form>
<c:if test="${not empty erreur}">
    <p style="color: red">${erreur}</p>
</c:if>
</body>
</html>
