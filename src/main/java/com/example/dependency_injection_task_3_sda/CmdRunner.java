package com.example.dependency_injection_task_3_sda;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CmdRunner implements CommandLineRunner {
    private final BeanConfig beanConfig;

    private final ApplicationContext applicationContext;
    @Override
    public void run(String... args) throws Exception {
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
