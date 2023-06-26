<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    
    <meta name="viewport" content="width=device-width,initial-sacle=1.0">
    <title>Student Form</title>
    <style>
        .design{
            width:400px;
            background-color: rgb(199, 246, 246);
            margin: 50px 520px;
            border: 5px double black;
            border-radius: auto;
            padding: 2px;
        }
    </style>
</head>
<body class="size">
        <form action="registrationServelet" method="post" name="user_input" autocomplete="off">
            <div class="design" >
            <div style="margin: 2px 5px;">
            <label for ="fname">Name</label>
            <input type="text" id="fname" name="fname" placeholder="eg:Arunkumar" maxlength="20" required style="margin:0px 120px ;">
            <br> <br>
            <label for ="dept">Department</label>
            <select for="dept" style="margin:0px 82px;" name="dept";>
                <option>CSE</option>
                <option>ECE</option>
                <option>EEE</option>
                <option>Mechanical</option>
                <option>Civil</option>
            </select>
            <br> <br>
            <label for="class">Section</label>
            <select  style="margin:0px 110px ;" name ="class">
                <option>A</option>
                <option>B</option>
                <option>C</option>
            </select>
            <br><br>
            <label for="rollno">Register number</label>
            <input type="text" id="rollno" name="rollno" maxlength="7" required style="margin:0px 160px ;">
            <br><br>
            <label for="add">Address</label>
            <textarea id="add" maxlength="50" name ="add" required style="margin:0px 160px ;"></textarea>
            <br><br>
            <label for="phno">PhoneNumber</label>
            <input type="tel" id="phno" placeholder="eg:9923456781" pattern="[0-9]{10}" name="phno" required style="margin:0px 160px ;"><br><br>
            <div style="text-align: center;">
            <button type="submit">Submit</button>
        </div>
        </div>
        </div>
        </form>
</body>
</html>