# spring-boot-console-sample
Example of a simple console Java app built with Spring Boot.

## Build Instructions:
Perform a Maven installation.  
From STS or similar, select "_Run As..._" -> "Maven install".  
The **.jar** archive will be installed in the `target` directory of the project.

## How to run:
Navigate to the location of the directory a run the following command:

```
java -jar spring-boot-console-sample-0.0.1-SNAPSHOT.jar
```

You should see the following output:

```
Hello Spring Boot from console!
```

## How it works:

First define your **`pom.xml`** with only the right _parent_ and the bare minimum dependencies:

```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.0.6.RELEASE</version>
    <relativePath /> <!-- lookup parent from repository -->
</parent>
```
and 

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter</artifactId>
</dependency>
```

Then have your Spring Boot Application class implement the `CommandLineRunner` interface, overriding its _`run()`_ method:

```java
@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {
  
    public static void main(String[] args) {
    	SpringApplication.run(SpringBootConsoleApplication.class, args);
    }
	
    @Override
    public void run(String... args) throws Exception {

    	// Add your application logic here
        System.out.println("Hello Spring Boot from console!");

        System.exit(0);
    }
}
```

Finally, to ensure it behaves and looks exactly like a typical command line application, we disable the splash screen, the startup logs, and set a logging level of at most `WARN` in our Spring `application.yml` file.  
This will ensure a completely silent application startup.

```yml
spring.main:
    web-application-type: none
    banner-mode: 'off'
    log-startup-info: false
logging.level.root: WARN
```