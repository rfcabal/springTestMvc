<%--
  Created by IntelliJ IDEA.
  User: zreactor
  Date: 11/11/18
  Time: 2:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>This a test for Streming data from JAVA Control you should see console.log con chrome console.</p>
    <p>Estos son los datos</p>
    <p id="id"></p>
    <p id="message"></p>
</body>
<script
        src="https://code.jquery.com/jquery-3.3.1.min.js"
        integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
        crossorigin="anonymous"></script>
<script>
    var  data = JSON.parse('${data}');
    $('#id').html(data.id);
    $('#message').html(data.message);
    console.log("This is the data");
    console.log(data);
</script>
</html>

