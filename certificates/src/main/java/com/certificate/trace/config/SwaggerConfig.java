package com.certificate.trace.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi customOpenAPI() {
        return GroupedOpenApi.builder()
                             .group("Certificates")
                             .pathsToMatch("/**")
                             .build();
    }
}
