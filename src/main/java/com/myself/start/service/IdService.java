package com.myself.start.service;

import com.myself.start.config.IdProperties;
import lombok.Data;

/**
 * @Description:
 * @Version: V1.0
 */
@Data
public class IdService {
    private IdProperties idProperties;

    public String getId(){
        return idProperties.getName()+"-"+System.currentTimeMillis();
    }
}
