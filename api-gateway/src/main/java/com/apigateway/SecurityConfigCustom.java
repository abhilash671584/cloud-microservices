package com.apigateway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;


@Configuration
@EnableWebFluxSecurity
public class SecurityConfigCustom {

	@Bean
	public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity httpSecurity) {
	
		httpSecurity.authorizeExchange(exchanges -> exchanges.anyExchange().authenticated())
		.oauth2Login(Customizer.withDefaults());
		httpSecurity.csrf().disable();
		return httpSecurity.build();
		
	}
	
}
