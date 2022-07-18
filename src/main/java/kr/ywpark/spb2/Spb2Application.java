package kr.ywpark.spb2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Spb2Application {

	public static void main(String[] args) {
		SpringApplication.run(Spb2Application.class, args);
	}
}