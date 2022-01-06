package com.gabriel.schooldemo.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceConfiguration {

    // A java way of configuration instead of using application.properties.
    // It's gonna override the data url propertie at application.properties
//    @Bean
//    public DataSource dataSource() {
//        DataSourceBuilder builder = DataSourceBuilder.create();
//        builder.url("jdbc:postgresql://localhost:5432/school");
//        builder.username("postgres");
//        builder.password("Alfakaparo09");
//        System.out.println("Java way config");
//        return builder.build();
//    }

}
