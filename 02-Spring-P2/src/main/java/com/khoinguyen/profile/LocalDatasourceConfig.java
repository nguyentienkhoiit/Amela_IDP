package com.khoinguyen.profile;

import com.khoinguyen.profile.LocalDatasource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("local")
public class LocalDatasourceConfig {
    @Value("${spring.datasource.username}")
    public String username;

    @Bean
    public LocalDatasource localDatasource() {
        return new LocalDatasource("Local object, Chỉ khởi tạo khi 'local' profile active "+username);
    }
}
