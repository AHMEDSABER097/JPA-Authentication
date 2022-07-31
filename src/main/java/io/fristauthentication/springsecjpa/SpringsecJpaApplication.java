package io.fristauthentication.springsecjpa;

import io.fristauthentication.springsecjpa.authen.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringsecJpaApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringsecJpaApplication.class, args);
	}

}
