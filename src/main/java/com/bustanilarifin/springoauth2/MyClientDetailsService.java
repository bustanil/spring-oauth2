package com.bustanilarifin.springoauth2;

import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Service;

@Service
public class MyClientDetailsService implements ClientDetailsService {

    @Override public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        if (clientId.equals("test")) {
            BaseClientDetails baseClientDetails = new BaseClientDetails("test", "DEFAULT", "read", "client_credentials,password", "USER");
            baseClientDetails.setClientSecret("{bcrypt}$2a$10$FjQ0HyFZcVuqM0.z6jpNcO9oHk46QTwKHjnvlARojPjVyWZw4VK3a");
            return baseClientDetails;
        } else {
            throw new ClientRegistrationException("haha");
        }
    }
}
