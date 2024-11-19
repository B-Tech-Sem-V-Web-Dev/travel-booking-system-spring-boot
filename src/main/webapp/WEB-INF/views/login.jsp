<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Travel Booking Login</title>
    <link rel="stylesheet" href="/css/styles2.css">
    <script src="/js/index.js"></script>
</head>

<body>
    <div class="background-image">
        <div class="container">
            <div class="image">
                <img src="/images/mountain2.avif" alt="" class="slide active">
                <img src="/images/forest.jpg" alt="" class="slide">
                <img src="/images/sea.webp" alt="" class="slide">
                <img src="/images/desert.webp" alt="" class="slide">
                <img src="/images/river.jpg" alt="" class="slide">
            </div>
            <div class="login-card">

                <h2>Login</h2>
                <form action="login" method="post">
                    
                    <input type="text" placeholder="Username" name="username" required>
                    <input type="password" placeholder="Password" name="password" required>
                    <button type="submit">Log In</button>
                    <div class="options">
                        <label><input type="checkbox"> Remember Me</label>
                        <a href="#">Forgot Password?</a>
                    </div>
                    <div class="signup-link">
                        <p>Don't have an account? <a href="register">Create Account</a></p>
                    </div>
                </form>
            </div>
            
        </div>
    </div>

</body>

</html>