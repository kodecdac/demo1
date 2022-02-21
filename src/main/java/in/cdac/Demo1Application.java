package in.cdac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);		
	}
	
	
	@EventListener(ApplicationReadyEvent.class)
	public void helloWorld() {
		System.out.println("Hello World!!!");
	}

}
