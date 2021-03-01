<%--
  Created by IntelliJ IDEA.
  User: Dat Bong
  Date: 3/1/2021
  Time: 4:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Từ điển</h1>
<form method="post" action="/dictionary">
<label>Nhập vào từ cần tra</label>
<input type="text" value="${word}" name ="word">
    <h1>Từ ${word} có tiếng việt là ${result}</h1>
</form>
</body>
</html>
