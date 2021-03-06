package com.bustanilarifin.springoauth2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.ClientDetailsService;

@Configuration
public class ClientConfiguration {
    
    @Bean ClientDetailsService clientDetailsService(){
        return new MyClientDetailsService();
    }

}
