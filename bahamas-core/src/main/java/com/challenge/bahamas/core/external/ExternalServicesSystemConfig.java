package com.challenge.bahamas.core.external;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Component
public class ExternalServicesSystemConfig {

    @Value("${api.token}")
    private String apiToken;

}
