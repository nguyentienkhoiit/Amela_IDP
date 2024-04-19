package com.khoinguyen.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("aws")
public class AwsDatasourceConfig {
    @Value("${spring.datasource.username}")
    public String username;

    @Bean
    public LocalDatasource localDatasource() {
        return new LocalDatasource("Aws object, Chỉ khởi tạo khi 'aws' profile active "+username);
    }
}
