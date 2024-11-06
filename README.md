# Travel Booking System

This is the Travel Booking System project. The project is structured to use Spring Boot as the backend, and follows a standard project layout.

## Prerequisites

Before running this project, make sure you have the following installed:

- **Java Development Kit (JDK) 21**
- An IDE/Text Editor such as **IntelliJ IDEA** or **Eclipse** or **Visual Studio Code** (optional)

## Setting Up application.properties

To run this project, you need to create an `application.properties` file in the `src/main/resources` directory. This file is not shared in the repository to protect sensitive data.

### Instructions:

1. Navigate to `src/main/resources` (create `src/main/resources` if not available already).
2. Create a file named `application.properties`.
3. Add the following content to the file:

   ```properties
    spring.application.name=travelbookingsystem
<<<<<<< HEAD

=======
    
>>>>>>> 9cb5aac7524e8ed9a6e7ecfbc0cabb98a8073d66
    #view resolve
    spring.mvc.view.prefix=/WEB-INF/views/
    spring.mvc.view.suffix=.jsp
   ```

You may need to add additional configuration properties depending on your setup (e.g., database credentials, server port, etc.).

## Running the Application

Once you have set up the `application.properties` file, you can start the application using the Maven wrapper included in the project. Follow these instructions based on your operating system:

### 1. Using the Maven Wrapper

The Maven wrapper allows you to run Maven commands without needing to install Maven separately. You can use it to start the Spring Boot application.

- **On Linux or macOS**:

   ```bash
   ./mvnw spring-boot:run
   ```

- **On Windows**:

   ```bash
   mvnw.cmd spring-boot:run
   ```

### 2. Running from an IDE

Alternatively, you can run the application directly from an IDE like IntelliJ IDEA or Eclipse:

1. Open the project in your IDE.
2. Locate the main class, which is typically located in `src/main/java/com/transport/TravelbookingsystemApplication.java`.
3. Right-click on the main class and select **Run** or **Debug** (the exact option may vary depending on your IDE).

The application should start, and you can access it at `http://localhost:8080` by default (unless you have configured a different server port). Server port can be configured in `application.properties`.

> This project is the part of Web Developement project for Semester V of B.Tech IT Department, University of Calcutta.