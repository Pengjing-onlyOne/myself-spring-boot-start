package com.myself.start.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Description:
 * @Version: V1.0
 */
@Data
@ConfigurationProperties("machine.id")
public class IdProperties {
    private String name;
}
