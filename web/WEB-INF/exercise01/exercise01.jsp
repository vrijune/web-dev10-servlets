<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Biography of ${firstName} ${lastName}</h2>
<p>${firstName} is ${age} years old and was born in ${placeOfBirth}.</p>
<p>${biography}</p>

</body>
</html>
