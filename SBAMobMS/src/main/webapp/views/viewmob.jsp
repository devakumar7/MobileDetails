<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  <body bgcolor="pink">
<h1>User Details</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr>
    <th>Id</th>
    <th>Name</th>
    <th>Company</th>
    <th>RAM</th>
    <th>ROM</th>
    <th>Processor</th>
    <th>OS</th>
    <th>IMEI No</th>
    <th>Price</th>
    <th>Manufacture Date</th>
    <th>Edit</th>
    <th>Delete</th></tr>  
   <c:forEach var="user" items="${mobs}">   
   <tr>  
   <td>${mob.id}</td>  
   <td>${mob.name}</td>  
   <td>${mob.company}</td>  
   <td>${mob.ram}</td>  
   <td>${mob.rom}</td>  
   <td>${mob.processor}</td>  
   <td>${mob.os}</td>  
   <td>${mob.imeiNo}</td>  
   <td>${mob.price}</td>  
   <td>${mob.manufactureDate}</td>  
   <td><a href="editmob/${mob.id}">Edit</a></td>  
   <td><a href="deletemob/${mob.id}">Delete</a></td>  
   </tr>  
   
   </c:forEach>  
   </table>  
   <br/>  
   <a href="/">Add New Mob</a>  
   </body>
