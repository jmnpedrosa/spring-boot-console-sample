package pt.jmnpedrosa.samples.springbootconsole;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
