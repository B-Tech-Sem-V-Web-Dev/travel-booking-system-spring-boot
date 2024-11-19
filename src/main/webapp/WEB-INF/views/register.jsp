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
                            <th><label for="name">Name:</label></th>
                            <th><input type="text" id="name" name="name" placeholder="Name" required></th>
                        </tr>
                        <tr>
                            <th><label for="uname">Username:</label></th>
                            <th><input type="text" id="uname" name="username" placeholder="Username" required></th>
                        </tr>
                        <tr>
                            <th><label for="email">Email:</label></th>
                            <th><input type="email" id="email" name="email" placeholder="Email" required></th>
                        </tr>
                        <tr>
                            <th><label for="age">Age:</label></th>
                            <th><input type="number" id="age" name="age" placeholder="Age" required></th>
                        </tr>
                        <tr>
                            <th><label for="nationality">Nationality:</label></th>
                            <th>
                                <select id="nationality" name="nationality" required>
                                    <option value="" disabled selected>Select</option>
                                    <option value="afghanistan">Afghanistan</option>
                                    <option value="albania">Albania</option>
                                    <option value="algeria">Algeria</option>
                                    <option value="andorra">Andorra</option>
                                    <option value="angola">Angola</option>
                                    <option value="antigua-and-barbuda">Antigua and Barbuda</option>
                                    <option value="argentina">Argentina</option>
                                    <option value="armenia">Armenia</option>
                                    <option value="australia">Australia</option>
                                    <option value="austria">Austria</option>
                                    <option value="azerbaijan">Azerbaijan</option>
                                    <option value="bahamas">Bahamas</option>
                                    <option value="bahrain">Bahrain</option>
                                    <option value="bangladesh">Bangladesh</option>
                                    <option value="barbados">Barbados</option>
                                    <option value="belarus">Belarus</option>
                                    <option value="belgium">Belgium</option>
                                    <option value="belize">Belize</option>
                                    <option value="benin">Benin</option>
                                    <option value="bhutan">Bhutan</option>
                                    <option value="bolivia">Bolivia</option>
                                    <option value="bosnia-and-herzegovina">Bosnia and Herzegovina</option>
                                    <option value="botswana">Botswana</option>
                                    <option value="brazil">Brazil</option>
                                    <option value="brunei">Brunei</option>
                                    <option value="bulgaria">Bulgaria</option>
                                    <option value="burkina-faso">Burkina Faso</option>
                                    <option value="burundi">Burundi</option>
                                    <option value="cabo-verde">Cabo Verde</option>
                                    <option value="cambodia">Cambodia</option>
                                    <option value="cameroon">Cameroon</option>
                                    <option value="canada">Canada</option>
                                    <option value="central-african-republic">Central African Republic</option>
                                    <option value="chad">Chad</option>
                                    <option value="chile">Chile</option>
                                    <option value="china">China</option>
                                    <option value="colombia">Colombia</option>
                                    <option value="comoros">Comoros</option>
                                    <option value="congo-democratic-republic">Congo (Democratic Republic)</option>
                                    <option value="congo-republic">Congo (Republic)</option>
                                    <option value="costa-rica">Costa Rica</option>
                                    <option value="croatia">Croatia</option>
                                    <option value="cuba">Cuba</option>
                                    <option value="cyprus">Cyprus</option>
                                    <option value="czech-republic">Czech Republic</option>
                                    <option value="denmark">Denmark</option>
                                    <option value="djibouti">Djibouti</option>
                                    <option value="dominica">Dominica</option>
                                    <option value="dominican-republic">Dominican Republic</option>
                                    <option value="ecuador">Ecuador</option>
                                    <option value="egypt">Egypt</option>
                                    <option value="el-salvador">El Salvador</option>
                                    <option value="equatorial-guinea">Equatorial Guinea</option>
                                    <option value="eritrea">Eritrea</option>
                                    <option value="estonia">Estonia</option>
                                    <option value="eswatini">Eswatini</option>
                                    <option value="ethiopia">Ethiopia</option>
                                    <option value="fiji">Fiji</option>
                                    <option value="finland">Finland</option>
                                    <option value="france">France</option>
                                    <option value="gabon">Gabon</option>
                                    <option value="gambia">Gambia</option>
                                    <option value="georgia">Georgia</option>
                                    <option value="germany">Germany</option>
                                    <option value="ghana">Ghana</option>
                                    <option value="greece">Greece</option>
                                    <option value="grenada">Grenada</option>
                                    <option value="guatemala">Guatemala</option>
                                    <option value="guinea">Guinea</option>
                                    <option value="guinea-bissau">Guinea-Bissau</option>
                                    <option value="guyana">Guyana</option>
                                    <option value="haiti">Haiti</option>
                                    <option value="honduras">Honduras</option>
                                    <option value="hungary">Hungary</option>
                                    <option value="iceland">Iceland</option>
                                    <option value="india">India</option>
                                    <option value="indonesia">Indonesia</option>
                                    <option value="iran">Iran</option>
                                    <option value="iraq">Iraq</option>
                                    <option value="ireland">Ireland</option>
                                    <option value="israel">Israel</option>
                                    <option value="italy">Italy</option>
                                    <option value="jamaica">Jamaica</option>
                                    <option value="japan">Japan</option>
                                    <option value="jordan">Jordan</option>
                                    <option value="kazakhstan">Kazakhstan</option>
                                    <option value="kenya">Kenya</option>
                                    <option value="kiribati">Kiribati</option>
                                    <option value="korea-north">Korea (North)</option>
                                    <option value="korea-south">Korea (South)</option>
                                    <option value="kosovo">Kosovo</option>
                                    <option value="kuwait">Kuwait</option>
                                    <option value="kyrgyzstan">Kyrgyzstan</option>
                                    <option value="laos">Laos</option>
                                    <option value="latvia">Latvia</option>
                                    <option value="lebanon">Lebanon</option>
                                    <option value="lesotho">Lesotho</option>
                                    <option value="liberia">Liberia</option>
                                    <option value="libya">Libya</option>
                                    <option value="liechtenstein">Liechtenstein</option>
                                    <option value="lithuania">Lithuania</option>
                                    <option value="luxembourg">Luxembourg</option>
                                    <option value="madagascar">Madagascar</option>
                                    <option value="malawi">Malawi</option>
                                    <option value="malaysia">Malaysia</option>
                                    <option value="maldives">Maldives</option>
                                    <option value="mali">Mali</option>
                                    <option value="malta">Malta</option>
                                    <option value="marshall-islands">Marshall Islands</option>
                                    <option value="mauritania">Mauritania</option>
                                    <option value="mauritius">Mauritius</option>
                                    <option value="mexico">Mexico</option>
                                    <option value="micronesia">Micronesia</option>
                                    <option value="moldova">Moldova</option>
                                    <option value="monaco">Monaco</option>
                                    <option value="mongolia">Mongolia</option>
                                    <option value="montenegro">Montenegro</option>
                                    <option value="morocco">Morocco</option>
                                    <option value="mozambique">Mozambique</option>
                                    <option value="myanmar">Myanmar</option>
                                    <option value="namibia">Namibia</option>
                                    <option value="nauru">Nauru</option>
                                    <option value="nepal">Nepal</option>
                                    <option value="netherlands">Netherlands</option>
                                    <option value="new-zealand">New Zealand</option>
                                    <option value="nicaragua">Nicaragua</option>
                                    <option value="niger">Niger</option>
                                    <option value="nigeria">Nigeria</option>
                                    <option value="north-macedonia">North Macedonia</option>
                                    <option value="norway">Norway</option>
                                    <option value="oman">Oman</option>
                                    <option value="pakistan">Pakistan</option>
                                    <option value="palau">Palau</option>
                                    <option value="panama">Panama</option>
                                    <option value="papua-new-guinea">Papua New Guinea</option>
                                    <option value="paraguay">Paraguay</option>
                                    <option value="peru">Peru</option>
                                    <option value="philippines">Philippines</option>
                                    <option value="poland">Poland</option>
                                    <option value="portugal">Portugal</option>
                                    <option value="qatar">Qatar</option>
                                    <option value="romania">Romania</option>
                                    <option value="russia">Russia</option>
                                    <option value="rwanda">Rwanda</option>
                                    <option value="saint-kitts-and-nevis">Saint Kitts and Nevis</option>
                                    <option value="saint-lucia">Saint Lucia</option>
                                </select>
                            </th>
                        </tr>
                        <tr>
                            <th>Gender:</th>
                            <th>
                                <div>
                                    <input type="radio" id="gender1" name="gender" value="male" required>
                                    <label for="gender1">Male</label>
                                    <input type="radio" id="gender2" name="gender" value="female" required>
                                    <label for="gender2">Female</label>
                                    <input type="radio" id="gender3" name="gender" value="other" required>
                                    <label for="gender3">Other</label>
                                </div>
                            </th>
                        </tr>
                        <tr>
                            <th><label for="phno">Phone Number:</label></th>
                            <th><input type="tel" id="phno" name="phno" placeholder="Phone Number" required></th>
                        </tr>
                        <tr>
                            <th><label for="address">Address:</label></th>
                            <th><input type="text" id="address" name="address" placeholder="Address"></th>
                        </tr>
                        <tr>
                            <th><label for="pass">Password:</label></th>
                            <th><input type="password" id="pass" name="password" placeholder="Password" required></th>
                        </tr>
                    </table>
                    <button type="submit">Sign Up</button>
                </form>
            </div>
        </div>
    </div>
</body>

</html>