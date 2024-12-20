<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Travel Booking Sign Up</title>
    <link rel="stylesheet" href="/css/styles2.css">
    <link rel="stylesheet" href="/css/registerstyles.css">
    <script src="/js/index.js" defer></script>
</head>

<body>
    <div class="background-image">
        <div class="container">
            <div class="image">
                <img src="/images/mountain2.avif" alt="Mountain" class="slide active">
                <img src="/images/forest.jpg" alt="Forest" class="slide">
                <img src="/images/sea.webp" alt="Sea" class="slide">
                <img src="/images/desert.webp" alt="Desert" class="slide">
                <img src="/images/river.jpg" alt="River" class="slide">
            </div>
            <div class="register-card">
                <h2>Sign Up</h2>
                <form action="register" method="post">
                    <table>
                        <tr>
                            <th><label for="username">Username:</label></th>
                            <th><input type="text" id="username" name="username" placeholder="Username" required></th>
                        </tr>
                        <tr>
                            <th><label for="password">Password:</label></th>
                            <th><input type="password" id="password" name="password" placeholder="Password" required></th>
                        </tr>
                        <tr>
                            <th><label for="email">Email:</label></th>
                            <th><input type="email" id="email" name="email" placeholder="Email" required></th>
                        </tr>
                        <tr>
                            <th><label for="phone_number">Phone Number:</label></th>
                            <th><input type="tel" id="phone_number" name="phone_number" placeholder="Phone Number" required></th>
                        </tr>
                        <tr>
                            <th><label for="citizenship">Citizenship:</label></th>
                            <th>
                                <select id="citizenship" name="citizenship" required>
                                    <option value="India">India</option>
                                    <option value="Other">Other</option>
                                </select>
                            </th>
                        </tr>
                        <tr id="aadhar_number_row">
                            <th><label for="aadhar_number">Aadhar Number (Only for India):</label></th>
                            <th><input type="text" id="aadhar_number" name="aadhar_number" placeholder="Aadhar Number" pattern="\d{12}" title="Aadhar Number should be 12 digits" required></th>
                        </tr>
                        <tr>
                            <th><label for="age">Age:</label></th>
                            <th><input type="number" id="age" name="age" placeholder="Age" min="1" required></th>
                        </tr>
                        <tr>
                            <th><label for="gender">Gender:</label></th>
                            <th>
                                <select id="gender" name="gender" required>
                                    <option value="Male">Male</option>
                                    <option value="Female">Female</option>
                                    <option value="Other">Other</option>
                                </select>
                            </th>
                        </tr>
                        <tr>
                            <th><label for="address">Address:</label></th>
                            <th><textarea id="address" name="address" placeholder="Your address" required></textarea></th>
                        </tr>
                        <tr>
                            <th><button type="submit">Sign Up</button></th>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
    </div>

    <script>
        document.getElementById('citizenship').addEventListener('change', function () {
            var aadharRow = document.getElementById('aadhar_number_row');
            if (this.value === 'India') {
                aadharRow.style.display = 'table-row';
                document.getElementById('aadhar_number').setAttribute('required', 'required');
            } else {
                aadharRow.style.display = 'none';
                document.getElementById('aadhar_number').removeAttribute('required');
            }
        });
    </script>
</body>

</html>
