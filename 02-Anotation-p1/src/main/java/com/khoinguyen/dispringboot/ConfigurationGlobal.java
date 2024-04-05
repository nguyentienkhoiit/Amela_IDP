package com.khoinguyen.dispringboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationGlobal {
    @Value("${sql.url}")
    private String url;

    @Value("${sql.username}")
    private String username;

    @Value("${sql.password}")
    private String password;


//    @Bean
//    @Primary
//    public Girl createNgocTrinh(){
//        IOutfit bikini = new Bikini();
//        Girl girl = new Girl( bikini);
//        girl.setName("Ngọc Trinh");
//        return girl;
//    }

    @Bean("connection")
    public String getConnection(){
        return "url: "+url+", username: "+username+", password: "+password;
    }
}
