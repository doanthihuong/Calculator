<%--
  Created by IntelliJ IDEA.
  User: Doan Thi Huong
  Date: 5/23/2022
  Time: 9:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="/mayTinh" method="get">
    <table>
        <tr>
            <td> First</td>
            <td><input type="text" name="a" value="${first}">
            </td>
        </tr>
        <tr>
            <td> Second</td>
            <td><input type="text" name="b" value="${second}">
            </td>
        </tr>
        <tr>
            <td> Operator</td>
            <td>
                <select name="ope">
                    <option ${cong}>+</option>
                    <option ${tru}>-</option>
                    <option ${nhan}>*</option>
                    <option ${chia}>/</option>
                </select>
            </td>
        <tr>
        <tr>
            <td></td>
            <td>
                <button type="submit">Compute</button>
            </td>
        </tr>
        <tr>
            <td>Result</td>
            <td><input type="text" value="${r}">
            </td>
        </tr>
    </table>
</form>


</body>
</html>
