package com.myself.start.service;

import com.myself.start.config.LockProperties;
import lombok.Data;

/**
 * @Description:
 * @Version: V1.0
 */
@Data
public class LockieService {
    LockProperties lockProperties;

    public String hello(String name){
        return lockProperties.getPrefix()+"-"+name+"-"+lockProperties.getSuffix();
    }
}
