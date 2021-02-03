<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>
        All Employees
    </title>


</head>
<body>

    <h2>All employees</h2><br>
    <table>
        <tr>
            <th>Name</th>
            <th>Surname</th>
            <th>Department</th>
            <th>Salary</th>
            <th>Action</th>
        </tr>
        <c:forEach var="emp" items="${allEmps}">
        <tr>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.department}</td>
            <td>${emp.salary}</td>
            <td><button formaction="/update">Update</button> </td>
        </tr>


        </c:forEach>



    </table>




</body>





</html>