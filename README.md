# IN2201 - Software Engineering
## Lab 05: Apache Maven Practical Tasks

### Student Details
* **Full Name:** Madhura Ravishan Abeywickrama
* **Registration Number:** 244004M
* **Module:** IN2201 Software Engineering

---

## 1. Executive Summary & Task Descriptions

This project demonstrates the fundamentals of build automation, project structure standardization, dependency management, and executable artifact creation using Apache Maven.

### Task 1: Project Initialization & Standard Archetype
* **Purpose:** Establish a standardized Java project directory structure using Maven's quickstart archetype.
* **Implementation:** Generated the `hello-world` directory structure using `mvn archetype:generate`. This established the convention-over-configuration layout (`src/main/java`, `src/test/java`, `pom.xml`).

### Task 2: Project Object Model (POM) Configuration & Java Versioning
* **Purpose:** Configure the central project descriptor (`pom.xml`) to manage runtime settings, properties, and build behaviors.
* **Implementation:** Configured `<maven.compiler.source>` and `<maven.compiler.target>` to Java 1.8. Defined custom properties (`app.name` and `app.version`) to enable dynamic application configuration.

### Task 3: Dependency Management & Fat JAR Packaging
* **Purpose:** Integrate external third-party libraries and package them into a self-contained, distributable executable archive.
* **Implementation:** Added the `JColor` library (`com.diogonunes:JColor:5.5.1`) to enable colored ANSI terminal outputs. Configured both the `maven-jar-plugin` (to define the manifest entry point `com.mycompany.app.App`) and the `maven-shade-plugin` (to bundle all third-party dependencies into a single Fat/Uber JAR file).

### Task 4: Java Application & Runtime Property Consumption
* **Purpose:** Develop source code utilizing third-party libraries and handle dynamic JVM system properties.
* **Implementation:** Created `App.java` to import JColor formatting functions and retrieve JVM runtime properties via `System.getProperty()`.

---

## 2. Directory Structure

```text
hello-world/
├── .gitignore
├── pom.xml
├── README.md
└── src/
    ├── main/
    │   └── java/
    │       └── com/
    │           └── mycompany/
    │               └── app/
    │                   └── App.java
    └── test/
        └── java/
            └── com/
                └── mycompany/
                    └── app/
                        └── AppTest.java
