package com.myself.start.configuration;

import com.myself.start.config.IdProperties;
import com.myself.start.service.IdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Version: V1.0
 */
@Configuration
@EnableConfigurationProperties(IdProperties.class)
public class IdAutoConfiguration {
    @Autowired
    private IdProperties idProperties;

    @Bean
    public IdService idService(){
        IdService idService = new IdService();
        idService.setIdProperties(idProperties);
        return idService;
    }
}
