<%@page import="com.transport.travelbookingsystem.models.Users"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User page</title>
    <link rel="stylesheet" href="/css/profilestyle.css">
    <script src="/js/index.js"></script>
</head>

<body>
    <% 
    Users user=(Users) request.getAttribute("user");
     %>
    <div class="container">
        <div class="usernavbar">
            <div class="navbar-brand">TravelMate</div>
            <ul class="navbar-links">
                <li><a href="/user/profile">Dashboard</a></li>
                <li><a href="#packages">Booking Packages</a></li>
                <li><a href="#gallery">TravelMate Gallery</a></li>
                 <li><a href="/travel/plans">Your Plans</a></li>
                <li><a href="/travel/create">Booking form</a></li>
            </ul>
            <div class="navbar-account">
                <form action="/logout" method="post">
                    <button type="submit">Logout</button>
                </form>
                
            </div>
        </div>
        <div class="userinfo">
            <div class="usersidebar">
                <div class="greetinguser">
                    <div class="userimage"><img src="/images/profilelogo.png"></div>
                    <div class="hello ">Hello,</div>
                    <div class="name "><span style="color:  rgba(183, 43, 0, 0.927);;"><%= user.getUsername() %></span></div>

                </div>
                <div class="logindetails"><a href="#profile">Profile Details</a></div>
                <div class="logindetails"><a href="#logininfo">Login Details</a></div>
            </div>

            <div class="userdetails">
                <div class="profile" id="profile">
                    <h2>My Profile</h2>
                    <table>
                        <tr>
                            <th>Your name: </th>
                            <th><%= user.getName() %></th>
                        </tr>
                        <tr>
                            <th>Your Email: </th>
                            <th><%= user.getEmail() %></th>
                        </tr>
                        <tr>
                            <th>Your citezenship: </th>
                            <th><%= user.getCitizenship()  %></th>
                        </tr>
                        <tr>
                            <th>Your aadhar number: </th>
                            <th><%= user.getAadharNumber()  %></th>
                        </tr>
                        <tr>
                            <th>Your age: </th>
                            <th><%= user.getAge()%></th>
                        </tr>
                        <tr>
                            <th>Your gender: </th>
                            <th><%= user.getGender() %></th>
                        </tr>
                        <tr>
                            <th>Your address: </th>
                            <th><%= user.getAddress() %></th>
                        </tr>
                    </table>
                </div>
                <div class="logininfo" id="logininfo">
                    <h2>My login info</h2>
                    <table>
                        <tr>
                            <th>login Phone number: </th>
                            <th><%= user.getPhoneNumber() %></th>
                        </tr>
                        <tr>
                            <th>Profile Creation time: </th>
                            <th><%= user.getCreatedAt()%></th>
                        </tr>
                        <tr><th><a href="#">Change Password?</a></th></tr>
                    </table>
                </div>
                
            </div>
        </div>
    </div>
</body>

</html>