# Read Me First
The following was discovered as part of building this project:

* The JVM level was changed from '1.8' to '17', review the [JDK Version Range](https://github.com/spring-projects/spring-framework/wiki/Spring-Framework-Versions#jdk-version-range) on the wiki for more details.

# Getting Started

### Here is a typical directory for this application

gradle/wrapper/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── projectname/
│   │   │               ├── Application.java          // Main application class
│   │   │               ├── controller/               // Controllers
│   │   │               ├── service/                  // Services
│   │   │               ├── repository/               // Repositories (if using JPA)
│   │   │               └── model/                    // Domain models/entities
│   │   │
│   │   └── resources/
│   │       ├── static/                              // Static web assets
│   │       ├── templates/                           // Thymeleaf or other templates
│   │       ├── application.properties               // Application properties
│   │       └── application.yml                      // YAML config (alternative to properties)
│   │
│   └── test/                                        // Unit and integration tests
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── projectname/
│       │               └── ...                       // Test classes
│       └── resources/
│           └── ...                                  // Test resources
│
├── target/                                          // Compiled output (Maven)
├── build/                                           // Compiled output (Gradle)
│
├── pom.xml                                          // Maven build configuration
└── build.gradle                                     // Gradle build configuration (alternative to Maven)

### Key Components:
src/main/java/: This is the main source directory for Java code. It typically follows the package naming conventions. Inside, you structure your application into subpackages like controller, service, repository, and model.

Application.java: The main application class with @SpringBootApplication annotation and the main method.
controller/: Contains the MVC controllers for handling web requests.
service/: Holds the service classes with business logic.
repository/: If using Spring Data JPA, this would contain interfaces for data access.
model/: Contains domain models or entities, usually mapped to database tables.
src/main/resources/: This directory contains non-Java resources, such as properties files, XML configurations, static web resources, and template files.

static/: Holds static resources like CSS, JS, and images.
templates/: If using a templating engine (like Thymeleaf), HTML templates go here.
application.properties or application.yml: Configuration files for Spring Boot. They can define database connections, server properties, custom configurations, etc.
src/test/java/: Contains the test source code. The structure inside this directory often mirrors that of the main Java source directory.

src/test/resources/: Resources for testing, like configuration files specifically for tests.

pom.xml (Maven) or build.gradle (Gradle): These are the build configuration files for Maven and Gradle, respectively. They define project dependencies, build plugins, and other build-related tasks.

target/ or build/: These directories are generated after compiling the project (for Maven and Gradle respectively) and contain the compiled classes, JAR files, etc.

### Lets go over the code

`@SpringBootApplication`
is @RestController and tells Spring that this class will be a controller where every method returns an domain object instead of a view. It's shorthand for including both `@Controller` and `@ResponseBody`

`@GetMapping("/hello")`: This annotation defines that the `sayHello` method will be called when a GET request is made to the `/hello` URL path.

`sayHello()`: is a simple method that returns a string. In this case, when the `/hello` endpoint is accessed, it returns "Hello from Spring!".

### Running tests

run `/gradlew test`

to reference the hello world code checkout into branch hello_world which can be done by retrieving all branches with this command `git branch -r | grep -v '\->' | sed "s,\x1B\[[0-9;]*[a-zA-Z],,g" | while read remote; do git branch --track "${remote#origin/}" "$remote"; done` then type this into the terminal `git checkout hello_world`

### The main branch is the Scheduling App (Key Components)

1. Domain Models

    - User: Represents users of the system.
    - Appointment: Represents an appointment slot.

2. Repositories

Create interfaces for database operations:

3. Services

Implement business logic:

4. Controllers

Handle HTTP requests:

5. DTOs (Data Transfer Objects)

For transferring data between client and server:

### Key Features to Implement going forward

Write tests as well

Creating Appointments: Allow users to create appointment slots.

Listing Appointments: Users can view available slots.

Booking Appointments: Allow users to book available slots.

Cancelling Appointments: Users can cancel their bookings.

Additional Considerations
Validation: Ensure that appointments do not overlap and handle user input validation.
Error Handling: Implement global exception handling.
Security: Secure endpoints (Spring Security can be used for this).
Front-end Integration: Integrate with a front-end framework like React or Angular for a user interface.

Add advanced features like OAuth2 authentication, email notifications, integration with external calendar services, etc.

### To run the application

#### Prerequisites

Java: Spring Boot requires Java. You can check your Java version with java -version.
Gradle: If you're not using the Gradle Wrapper (which comes with most Spring Boot projects), make sure you have Gradle installed. You can check with gradle -v.

In your terminal run `./gradlew build`

then after the build run this to run the application

`./gradlew bootRun`

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.5/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.5/gradle-plugin/reference/html/#build-image)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

