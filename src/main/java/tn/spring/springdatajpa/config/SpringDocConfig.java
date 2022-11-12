package tn.spring.springdatajpa.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(infoAPI());
    }
    public Info infoAPI() {
        return new Info().title("SpringDoc-Demo")
                .description("TP étude de cas")
                .contact(contactAPI());
    }

    public Contact contactAPI() {
        Contact contact = new Contact().name("Equipe ASI II")
                        .email("mohamedamine.rzigui@esprit.tn")
                .url("https://www.linkedin.com/in/**********/");

        return contact;
}

   /* @Bean
    public GroupedOpenApi ContratPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only Contrat Management API")
                                .pathsToMatch("/Contrat/**")
                                //.pathsToMatch("/Equipe/**")
                                //.pathsToMatch("/Etudiant/**")
                                .pathsToExclude("**")
                                .build();
    }*/




}