<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>TravelMate</title>
    <link rel="stylesheet" href="/css/stylehome.css">
    <script src="/javaScript/home.js"></script>
</head>
<body>
    <div class="container">
        <!-- Navbar -->
        <nav class="navbar">
            <div class="navbar-brand">TravelMate</div>
            <ul class="navbar-links">
                <li><a href="#hotels">Hotels</a></li>
                <li><a href="#destinations">Destinations</a></li>
                <li><a href="#about">About</a></li>
                <li><a href="#faq">FAQ</a></li>
                <li><a href="#contact">Contact</a></li>
            </ul>
            <div class="navbar-account">
                <a href="login">Login</a> | <a href="register">Create Account</a>
            </div>
        </nav>
        <div class="homebanner">
            <div class="hometxt">
                <center>
                    <p>Book your travel & hotels</p>
                    <p>o your destination using TravelMate</p>
                </center>
            </div>
            <div class="homeimage" id="homepage">
                <img src="/images/plane2.jpg" alt="" class="slide active">
                <img src="/images/bus1.jpg" alt="" class="slide">
                <img src="/images/train1.jpg" alt="" class="slide">
            </div>
        </div>

        <!-- Hotel Images Section -->
        <div class="hotels" id="hotels">
            <h2>Hotels</h2>
            <div class="image-gallery" id="image-container">
                <div class="scroll-container" id="scroll-container">
                    <div class="hotelinfo" id="hotel1">
                        <h2>Hotel1</h2>
                    </div>
                    <div class="hotelinfo" id="hotel2">
                        <h2>Hotel2</h2>
                    </div>
                    <div class="hotelinfo" id="hotel3">
                        <h2>Hotel3</h2>
                    </div>
                    <div class="hotelinfo" id="hotel4">
                        <h2>Hotel4</h2>
                    </div>
                </div>
                <!-- buttons -->
                <button class="scroll-left" id="scroll-left">◀</button>
                <button class="scroll-right" id="scroll-right">▶</button>

            </div>
        </div>

        <!-- Destination Images Section -->
        <div class="destinations" id="destinations">
            <h2>Destinations</h2>
            <div class="image-gallery">
                <div class="scroll-container" id="scroll-container-destination">
                    <div class="hotelinfo" id="destination1">
                        <h2>Maldives</h2>
                    </div>
                    <div class="hotelinfo" id="destination2">
                        <h2>Ladakh</h2>
                    </div>

                    <div class="hotelinfo" id="destination4">
                        <h2>Egypt</h2>
                    </div>
                    <div class="hotelinfo" id="destination3">
                        <h2>Sikkim</h2>
                    </div>
                </div>
                <!-- buttons -->
                <button class="scroll-left" id="scroll-left-destination">◀</button>
                <button class="scroll-right" id="scroll-right-destination">▶</button>
            </div>
        </div>

        <!-- About Section -->
        <div class="about" id="about">
            <h2>About Us</h2>
            <p>At TravelMate, we believe that travel is more than just moving from one place to another; it's about
                creating memories, exploring new horizons, and embracing the beauty of the world around us. Our platform
                is designed to simplify the process of planning and booking your journeys, making it easier than ever to
                turn your travel dreams into reality.

                Whether you’re planning a solo backpacking adventure, a romantic getaway, a family vacation, or a
                business trip, TravelMate is your one-stop destination for all your travel needs. We bring together the
                convenience of booking flights, trains, buses, and hotels into a single, seamless experience, saving you
                time and effort.</p>
            <br>
            <h4>Why Choose TravelMate?</h4>
            <p>
                Comprehensive Options: From luxurious five-star hotels to cozy budget accommodations, from international
                flights to regional trains and buses, we provide a wide array of choices tailored to meet your needs.
                Ease of Use: Our intuitive platform allows you to search, compare, and book your travel plans with just
                a few clicks. Whether you're a seasoned traveler or a first-timer, TravelMate ensures a hassle-free
                experience.
                Best Deals: We are committed to offering competitive pricing and exclusive deals, ensuring you get the
                best value for your money without compromising on quality.
                Customer Support: Our dedicated support team is available 24/7 to assist you with any questions or
                issues. Your satisfaction is our top priority.
                Personalized Experience: With features like customizable itineraries and travel recommendations, we
                strive to make your journey unique and memorable.
            </p>
            <br>
            <h4>Our Vision</h4>
            <p>We envision a world where travel is accessible, affordable, and enjoyable for everyone. By combining
                cutting-edge technology with a passion for exploration, we aim to revolutionize the way people plan and
                experience their trips.</p>
            <br>
            <h4>Our Services</h4>
            <p>
            <ul>
                <li>Flight Booking: Explore global destinations with ease. Find the best routes and prices for your air
                    travel needs.</li>
                <li>Train Reservations: Travel comfortably across scenic routes with our seamless train booking options.
                </li>
                <li>Bus Booking: For short or long-distance trips, we provide convenient bus booking solutions that
                    cater to your schedule.</li>
                <li>Hotel Stays: Discover accommodations that fit your style and budget, from luxury suites to charming
                    local stays.</li>
            </ul>
            </p>
        </div>

        <!-- FAQ Section -->
        <div class="faq-section" id="faq">
            <h2>Frequently Asked Questions</h2>
            <div class="faq">
                <div class="faq-item">
                    <div class="faq-question">What services does TravelMate offer?</div>
                    <div class="faq-answer">
                        <p>TravelMate allows you to book flights, trains, buses, and hotels. We provide a seamless
                            platform to plan your entire journey from start to finish.</p>
                    </div>
                </div>
                <div class="faq-item">
                    <div class="faq-question">How do I create an account?</div>
                    <div class="faq-answer">
                        <p>Click on the “Create Account” link in the navigation bar, fill in the required details, and follow the instructions to set up your account.</p>
                    </div>
                </div>
                <div class="faq-item">
                    <div class="faq-question">Can I cancel my booking?</div>
                    <div class="faq-answer">
                        <p>Yes, cancellations are possible depending on the terms and conditions of your booking. Visit your account section to manage cancellations.</p>
                    </div>
                </div>
            </div>
        </div>



        <!-- Contact Section -->
        <div class="contact" id="contact">
            <h2>Contact Us</h2>
            <p>Email: support@travelmate.com</p>
            <p>Phone: +1-234-567-890</p>
            <p>Address: Calcutta university , technology campus, JD block</p>
        </div>
    </div>

    <!-- Include JavaScript -->
    <script src="script.js"></script>
</body>
</html>