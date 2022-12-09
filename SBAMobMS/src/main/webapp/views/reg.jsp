<body bgcolor="pink">
    <h2>Fill below form to register</h2>
 
    <form action="/register" method="post">
        <table>
            <tr>
                <td>Enter Model Id:</td>
                <td><input type="text" name="modelNo" /></td>
            </tr>
            
            <tr>
                <td>Enter Model name:</td>
                <td><input type="text" name="modelName" /></td>
            </tr>

            <tr>
                <td>Enter Company:</td>
                <td><input type="text" name="company" /></td>
            </tr>
            
            <tr>
                <td>Enter RAM Capacity:</td>
                <td><input type="text" name="ram"/></td>
            </tr>

            <tr>
                <td>Enter ROM Capacity:</td>
                <td><input type="text" name="rom"/></td>
            </tr>

            <tr>
                <td>Enter Processor:</td>
                <td><input type="text" name="processor"/></td>
            </tr>

            <tr>
                <td>Enter OS:</td>
                <td><input type="text" name="os"/></td>
            </tr>

            <tr>
                <td>Enter IMEI No:</td>
                <td><input type="number" name="imeiNo"/></td>
            </tr>

            <tr>
                <td>Enter Price:</td>
                <td><input type="text" name="price"/></td>
            </tr>

            <tr>
                <td>Enter Manufacture Date:</td>
                <td><input type="text" name="manufactureDate"/></td>
            </tr>

            <tr>
                <td></td>
                <td><input type="submit" value="Register"></td>
            </tr>
        </table>
    </form>
    <a href="/viewmob">View All User Details</a>
 
</body>
</html>
