# Getting Started

## Dependencies

The first dependencies are:

- Java 11
- Spring Boot 2.4.4 as parent POM
- Starter Weblux + Reactor test


    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-webflux</artifactId>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>io.projectreactor</groupId>
        <artifactId>reactor-test</artifactId>
        <scope>test</scope>
    </dependency>

## Goal

This project's goal is to start working with Reactor and Spring Webflux. 

### What to do

Update the code step by step following the instruction. Each step leaves in a different branch of this repo.

#### Step 1

Fill the `org.sixdouglas.formation.spring.irrigation.DripIrrigation.followDrops` function to make the associated Unit Test runs successfully.
