<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Register</title>
    <!-- Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <form action="Register" method="post">
        <h1 class="mb-4">User Registration</h1>
        <div class="form-group">
            <label for="name">Name</label>
            <input type="text" class="form-control" id="name" name="Name">
        </div>
        <div class="form-group">
            <label for="phoneNumber">Phone Number</label>
            <input type="text" class="form-control" id="phoneNumber" name="PhoneNumber">
        </div>
        <div class="form-group">
            <label for="email">Email</label>
            <input type="email" class="form-control" id="email" name="Email">
        </div>
        <div class="form-group">
            <label for="age">Age</label>
            <input type="number" class="form-control" id="age" name="Age">
        </div>
        <button type="submit" class="btn btn-primary">
        </button>
        </form>
        </body>
        </html>