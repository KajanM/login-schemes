package com.kajan;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	   public static final String REALM_NAME = "test-login.com";
	   private static final String ENCODED_PASSWORD = "$2a$10$AIUufK8g6EFhBcumRRV2L.AQNz3Bjp7oDQVFiO5JJMBFZQ6x2/R/2";

	    @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http
	                .csrf()
	                    .disable()
	                .authorizeRequests()
	                    .anyRequest().authenticated()
	                .and()
	                .httpBasic()
	                    .realmName(REALM_NAME)
	                    .authenticationEntryPoint(new CustomAuthenticationEntryPoint());
	    }

	    @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	        auth.inMemoryAuthentication()
	        		.passwordEncoder(passwordEncoder())
	                .withUser("user")
	                .password(ENCODED_PASSWORD)
	                .roles("USER")
	            .and()
        			.passwordEncoder(passwordEncoder())
	                .withUser("manager")
	                .password(ENCODED_PASSWORD)
	                .roles("MANAGER");
	    }
	    
	    @Bean
		public PasswordEncoder passwordEncoder() {
			return new BCryptPasswordEncoder();
		}

	}
