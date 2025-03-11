package com.example.SwaggerDocumentation.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI productApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Product API Documentation")
                        .description("CRUD API documentation for Product management")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Soadul Islam").url("www.soadul.com")
                                .email("soadulislam5@gmail.com")
                                .url("www.linkedin.com/soadul")));
    }
} 