package com.jit.sb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.jit.sb.service.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class ProjectSecurityConfig {
	
	

	@Bean
	public SecurityFilterChain customSecurityFilterChain(HttpSecurity http) throws Exception {
		http.csrf().disable() 
		           .authorizeHttpRequests().regexMatchers("/account", "/balance", "/cards", "/loans").authenticated()
				    .regexMatchers("/contact", "/notices","/api").permitAll();
		http.formLogin();
		http.httpBasic();
		return http.build();
	}
	
	@Bean
	public PasswordEncoder encodePassword() {
		return NoOpPasswordEncoder.getInstance();
	}

}

//by default all req is secured but
//here we have explicity configure filter to authenticate specific req and to directly allow specific req
