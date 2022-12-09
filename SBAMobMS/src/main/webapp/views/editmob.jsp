<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  <body bgcolor="pink">
        <h1>Edit User Data</h1>  
       <form:form method="POST" action="/editu">    
        <table >    
        <tr>  
            <td>Model Id:</td>
            <td><input path="id" /></td>
        </tr>
        
        <tr>
            <td>Model name:</td>
            <td><input path="modelName" /></td>
        </tr>

        <tr>
            <td>Company:</td>
            <td><input path="company" /></td>
        </tr>
        
        <tr>
            <td>RAM Capacity:</td>
            <td><input path="ram"/></td>
        </tr>

        <tr>
            <td>ROM Capacity:</td>
            <td><input path="rom"/></td>
        </tr>

        <tr>
            <td>Processor:</td>
            <td><input path="processor"/></td>
        </tr>

        <tr>
            <td>OS:</td>
            <td><input path="os"/></td>
        </tr>

        <tr>
            <td>IMEI No:</td>
            <td><input path="imeiNo"/></td>
        </tr>

        <tr>
            <td>Price:</td>
            <td><input path="price"/></td>
        </tr>

        <tr>
            <td>Manufacture Date:</td>
            <td><input path="manufactureDate"/></td>
        </tr>
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>  
       <a href="/viewmob">View All Mob Details</a><p></p>
       <a href="/">Add New Mob Here</a>  
       </body>
