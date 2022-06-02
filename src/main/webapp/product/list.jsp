<%--
  Created by IntelliJ IDEA.
  User: AE
  Date: 6/2/2022
  Time: 2:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Danh sách sản phẩm
<a href="/products?act=create">Create</a>

<form action="/products">
<input type="text"name="name">
<button>Click</button>


<c:forEach items="${ds}" var="p">
    <h2>${p.id},${p.name},<a href="/products?act=edit&id=${p.id}">Edit</a>,
        <a href="/products?act=delete&id=${p.id}">Delete</a>
    </h2>

</c:forEach>
</form>
</body>
</html>
