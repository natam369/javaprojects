<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>sample demo for spring mvc</title>
<link rel="stylesheet" href="/resources/css/stylesample.css">
<script type="text/javascript" src="/resources/js/sample.js"></script>
</head>
<body>
<h1>Spring Boot - MVC web application example</h1>
<hr>

  <div class="form">
    <form action="sample" method="post" onsubmit="return verifyName()">
      <table>
        <tr>
          <td>Enter Your name</td>
          <td><input id="name" name="name"></td>
          <td><input type="submit" value="Submit"></td>
        </tr>
      </table>
    </form>
  </div>
</body>
</html>



