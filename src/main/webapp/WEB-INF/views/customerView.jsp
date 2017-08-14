
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
//define your own tag here: defined bridge between back end and front end
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th>CustomerID</th>
        <th>CompanyName</th>
    </tr>
    //for each item on my cList
<c:forEach items="${cList}" var="item">
<tr>
    <td>

        ${item.companyName}
    </td>
    <td>

        ${item.customerID}
    </td>
    <td>

            ${item.city}
    </td>

</tr>
</c:forEach>
</table>
</body>
</html>
