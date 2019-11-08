package dev.app.server;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;


@SpringBootApplication
@EntityScan(basePackageClasses= {
		ExAvitoApplication.class,
		Jsr310JpaConverters.class
})
public class ExAvitoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ExAvitoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
