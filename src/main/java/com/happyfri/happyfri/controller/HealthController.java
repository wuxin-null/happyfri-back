package com.happyfri.happyfri.controller;

import com.happyfri.happyfri.service.HealthSercvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lihanxun
 */
@RestController
public class HealthController {

    @Autowired
    private HealthSercvice healthSercvice;

    @GetMapping(value = "/health")
    public int query() {
        return 1;
    }

    @GetMapping(value = "/jdbcHealth")
    public int checkHealth(){
        return healthSercvice.checkHealth();
    }

}
