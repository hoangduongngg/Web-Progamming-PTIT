<!DOCTYPE html> 
<html> 
    <head>
        <meta charset="utf-8">
        <title>Email List</title> 
        <link rel="stylesheet" href="styles/main.css" type="text/css"/> </head> 
    <body> 
        <h1>Join our email list</h1> 
        <p>To join our email list, enter your name and 
            email address below.</p>
        <form action="emailList" method="post"> 
            <input type="hidden" name="action" value="add"> 
            <label>Email:</label> 
            <input type="email" name="email" required><br> 
            <span style="color: red">${message_email} </span> <br>
            <label>First Name:</label> 
            <input type="text" name="firstName" required><br> 
            <span style="color: red">${message_fn} </span> <br>
            <label>Last Name:</label> 
            <input type="text" name="lastName" required><br> 
          
            <span style="color: red">${message_ln} </span> <br>

        <div>
            <label>Gender: </label>
            <select name="gender">
                <option value="Male">Male</option>
                <option value="Female">Female</option>
                <option value="Other">Other</option>
            </select>
            <br>
        </div>
        
        <div>
            <label>Education:</label>
            <select name="education">
                <option value="University">University</option>
                <option value="College">College</option>
                <option value="Intermediate">Intermediate</option>
            </select>
        </div>  
        <br>
        
        <label>&nbsp;</label>
        <input type="submit" value="Join Now" id="submit">  </form> 
    </body> 
</html>
