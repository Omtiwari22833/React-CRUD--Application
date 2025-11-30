package net.javaguides.springboot.config;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Employee Management API")
                        .version("v1")
                        .description("Simple CRUD API for managing employees")
                        .contact(new Contact().name("JavaGuides").email("contact@javaguides.net"))
                );
    }
}

