<html>
    <body>
        <table>
         <h1>Enter Customer Details</h1>
        <form action ="/CustomerServlet" method="GET">
        <tr>
        <td>
        <label >CustomerID :</label></td>
        <td><input name="id"  ></input></td></tr>
        <tr><td><label >CustomerName :</label></td>
        <td><input name="name" ></input></td></tr>
         <tr><td><label >Date of Reg :</label></td>
         <td><input name ="dor"  ></input></td></tr>
         <tr><td><label >UserID</label></td>
        <td><input name="uid"  ></input></td></tr>
        <tr><td><label >Password</label></td>
            <td><input name="pass"  ></input></td></tr>
        <td><input type="submit" value="VerifyDetails" ></input></td></tr>
       </form>
       </table>
        </body>
</html>
