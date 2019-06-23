<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://topjava.javawebinar.ru/functions" %>
<html>
<head>
    <title>User list</title>
    <style>
table, th, td {
	border-spacing: 5px;
	/* border-collapse: separate; */
	border-collapse: collapse;
	padding: 8px;
	  border: 1px solid black;
}

.normal {
	color: green;
}

.enabled {
	color: green;
	font-size: 18px;
	font-style: Sans-serif;
}

.notenabled {
	color: blue;
	font-style: italic;
}
td { 
    padding: 5px;
    spacing: 0 ;
}
</style>
</head>
<body>
<section>
    <h2 style="color: fuchsia;"><a href="index.html">Home</a></h2>
    <h2>Users list</h2>
    <a href="users?action=create">Add User</a>
    <hr>
<!--     <table border="1" cellpadding="8" cellspacing="0"> -->
    <table  >
        <thead>
        <tr >
            <th>email</th>
            <th>password</th>
            <th>enabled</th>
            <th>registered</th>
            <th>roles</th>
            <th>caloriesPerDay</th>
            
            <th>Update</th>
            <th>Delete</th>
        </tr>
        </thead>
        <c:forEach items="${users}" var="user">
            <jsp:useBean id="user" scope="page" type="ru.javawebinar.topjava.model.User"/>
               <tr class="${user.enabled ? 'enabled' : 'notenabled'}">    
<%--     	<tr class="${meals.enabled  eq 'true' ? 'red' : 'green'}"> --%>
   <!--  	<tr  style="color: fuchsia;"> -->
            
               <!--  <td> -->
                        <%--${user.dateTime.toLocalDate()} ${user.dateTime.toLocalTime()}--%>
                        <%--<%=TimeUtil.toString(user.getDateTime())%>--%>
                      <%--   ${fn:formatDateTime(user.dateTime)} --%>
                <!-- </td> -->
                <td >${user.email}</td>
                <td>${user.password}</td>
                <td>${user.enabled}</td>
                <td>${user.registered}</td>
                <td>${user.roles}</td>
                <td>${user.caloriesPerDay}</td>
                
                <td><a href="users?action=update&id=${user.id}">Update</a></td>
                <td><a href="users?action=delete&id=${user.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</section>
</body>
</html>