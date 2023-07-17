package com.example.dependency_injection_task_3_sda;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
   public DummyLogger dummyLogger() {
        return new DummyLogger();
    }
    @Bean
    public ListUtil listUtility() {
        return new ListUtil();
    }

    @Bean(name = "strungUtility")
    public  StringUtil stringUtil() {
        return new StringUtil();
    }

}
