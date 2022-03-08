package com.company.day13;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataBaseConfig {
    @Bean
    public DataBase_Bean getDatabase_bean(){
        return  new DataBase_Bean();
    }
}
