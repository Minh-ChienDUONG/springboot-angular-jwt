package com.minhchienduong.springbootsecurityjwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.minhchienduong.springbootsecurityjwt.security.jwt")
@EntityScan("com.minhchienduong.springbootsecurityjwt.models")
@EnableJpaRepositories("com.minhchienduong.springbootsecurityjwt.repositories")
public class SpringBootSecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityJwtApplication.class, args);
	}

}
