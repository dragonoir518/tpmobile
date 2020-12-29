package com.epita.tpmobile;

import org.junit.Test;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootTest
@SpringBootConfiguration
@ComponentScan(basePackages = { "com.epita.tpmobile" }, lazyInit = true)
@EntityScan(basePackages = { "com.epita.tpmobile.domaine.entity" })
@EnableJpaRepositories
public class SpringBootAppTest {
    @Test
    public void contextLoads() {
    }


}
