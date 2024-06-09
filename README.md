# StartSpring

StartSpring is a Java Spring application built on the latest Spring Boot 3.3.0 framework. It implements JWT authentication using modern Spring Security and provides basic endpoints such as registration, login, and user data retrieval in REST format. The project follows the MVC (Model-View-Controller) architectural pattern.

## Features

- **JWT Authentication**: Secure your application with JSON Web Tokens.
- **Spring Security**: Leverage the latest Spring Security features for authentication and authorization.
- **REST Endpoints**:
  - **Registration**: Create a new user account.
  - **Login**: Authenticate with existing user credentials to receive a JWT.
  - **User Data**: Retrieve user information using a valid JWT.

## Prerequisites

- Java 21 or higher
- Maven 3.6.3 or higher
- An SQL database (e.g., MySQL, PostgreSQL)

## Getting Started

### Configure the application

1. Update the `application.yml` file in the `src/main/resources` directory with your database configuration and other necessary settings:

```datasource:
    url: jdbc:{CONNECTOR}://{ADDRESS}:{PORT}/{DATABASE_NAME}
    username: {USERNAME}
    password: {PASSWORD}
    driver-class-name: {DRIVER}
```

2. Update the `SecurityConstants` using your own JWT_SECRET:
```
    public static final long JWT_EXPIRATION_TIME = 86400;
    public static final String JWT_SECRET = {SECRET};
```

### Build and run the application using IDEA

The application will start on `http://localhost:8080`.

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes.

## Contact

For any inquiries or questions, please contact serguzeo@gmail.com
