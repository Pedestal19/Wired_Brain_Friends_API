package com.wiredbrain.friends;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@SpringBootApplication
public class FriendsApplication {

    @Bean
    UserDetailsService userDetailsService(){
        return new InMemoryUserDetailsManager(User.withDefaultPasswordEncoder()
                .username("hosanna")
                .password("hosanna")
                .roles("USER")
                .build());
    }

	public static void main(String[] args) {
		SpringApplication.run(FriendsApplication.class, args);
	}

}
