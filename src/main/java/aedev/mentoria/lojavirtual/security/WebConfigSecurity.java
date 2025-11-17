package aedev.mentoria.lojavirtual.security;

import org.springframework.boot.autoconfigure.session.RedisSessionProperties.ConfigureAction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import jakarta.servlet.http.HttpSessionListener;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true, securedEnabled = true)

public class WebConfigSecurity implements HttpSessionListener{
	
	//Qualquer pessoa pode acessar, ignora os filtros de segurança do security
	//Ele não vai autenticar
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

	    http
	        .csrf(csrf -> csrf.disable())
	        .authorizeHttpRequests(auth -> auth
	            .requestMatchers(HttpMethod.GET, "/salvarAcesso").permitAll()
	            .requestMatchers(HttpMethod.POST, "/salvarAcesso").permitAll()
	            .requestMatchers(HttpMethod.DELETE, "/deleteAcesso").permitAll()
	            .anyRequest().authenticated()
	        );

	    return http.build();
	}
	
}
