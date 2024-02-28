package com.myself.start.configuration;

import com.myself.start.config.LockProperties;
import com.myself.start.service.LockieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Version: V1.0
 */
@Configuration
@EnableConfigurationProperties(LockProperties.class)
public class LockAutoConfiguration {
    @Autowired
    private LockProperties lockProperties;

    @Bean
    public LockieService lockieService(){
        LockieService lockieService = new LockieService();
        lockieService.setLockProperties(lockProperties);
        return lockieService;
    }
}
