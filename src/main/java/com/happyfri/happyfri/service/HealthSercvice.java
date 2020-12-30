package com.happyfri.happyfri.service;

import com.happyfri.happyfri.mapper.HealthMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HealthSercvice {
    @Autowired
    HealthMapper healthMapper;
    public int checkHealth(){
        return healthMapper.checkHealth();
    }

}
