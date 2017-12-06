<%-- 
    Document   : index
    Created on : Nov 13, 2017, 6:46:16 PM
    Author     : james
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="SaveDetails" method="post" name="">
            Student No:
            <input type="text" name="Sno" required="" /><br></br>
            First name:
            <input type="text" name="f_name" required /><br></br>
            Last name:
            <input type="text" name="l_name" required /><br></br>
            Gender:
            <input type="radio" name="gender" value="male"/>Male
            <input type="radio" name="gender" value="female"/>Female
            <br></br>
            Program:
            <select name="program">
                <option value="">-select program-</option>
                <option value="BBIT">BBIT</option>
                <option value="ICS">Information & computer Technology</option>
                <option value="BCOM">BCOM</option>
                <!--add more programs here-->
            </select>
            <br></br>
            <input type="submit" value="Save" name="Student form"/>
        </form>
    </body>
</html>
