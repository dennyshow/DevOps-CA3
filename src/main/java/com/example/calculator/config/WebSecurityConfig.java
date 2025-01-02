package  com.example.calculator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
        .authorizeHttpRequests(authorize -> authorize
                .anyRequest().permitAll() // Allow unrestricted access to all endpoints
            )
            .csrf().disable()
            .httpBasic().disable()
            .formLogin().disable();

        return http.build();
    }
}
