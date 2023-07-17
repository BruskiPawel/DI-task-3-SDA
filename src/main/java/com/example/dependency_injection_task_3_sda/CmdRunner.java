package com.example.dependency_injection_task_3_sda;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Component
public class CmdRunner implements CommandLineRunner {
    private final BeanConfig beanConfig;

    private final ApplicationContext applicationContext;
    @Override
    public void run(String... args) throws Exception {
        Set<String> setOfBeans = Arrays.stream(applicationContext.getBeanDefinitionNames()).filter(b -> !b.contains(".")).collect(Collectors.toSet());
        final Set<String> correctBeanNames = Set.of("dummyLogger", "listUtility", "stringUtility");
        log.info("zadanie wykonane poprawnie: " + String.valueOf(setOfBeans.containsAll(correctBeanNames)));
    }
}
