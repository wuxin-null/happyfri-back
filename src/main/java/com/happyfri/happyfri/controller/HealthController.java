package com.happyfri.happyfri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lihanxun
 */
@RestController
public class HealthController {


    @GetMapping(value = "/")
    public int query() {
        return 1;
    }

}
