package app.bonjour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class BonjourApplication {

	public static void main(String[] args) {
		SpringApplication.run(BonjourApplication.class, args);
	}

}