<%@taglib uri="http://www.springframework.org/tags/form" prefix = "form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>
   
   <body>
      <h2>Student Information</h2>
       <form action="addStudent" method="POST">
        <table><tr>
  <td>Student Id: </td><td><input type="text" name="id"><br></td></tr>
<tr><td>Student name:</td><td><input type="text" name="name"><br></td></tr>
<tr><td>Student Age:</td><td><input type="text" name="age"></td></tr>
<tr><td><input type="submit" value="Submit"></td></tr>
</table>
           
</form> 


   </body>
</html>