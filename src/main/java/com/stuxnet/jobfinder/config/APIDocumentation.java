package com.stuxnet.jobfinder.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class APIDocumentation {

    @Bean
    public Docket apiDocumentation() {
        return
                new Docket(DocumentationType.SWAGGER_2)
                        .select()
                        .apis(RequestHandlerSelectors.basePackage("com.stuxnet.jobfinder.controller"))
                        .paths(PathSelectors.regex("/.*"))
                        .build()
                        .globalResponseMessage(RequestMethod.POST, Collections.emptyList())
                        .apiInfo(
                                new ApiInfoBuilder()
                                        .contact(new Contact("Pankaj Pardasani", "http://www.pankajpardasani.co.uk", "pankaj.d.p@gmail.com"))
                                        .description("Portal for job finder")
                                        .build())

                ;

    }
}
