package com.happyfri.happyfri.mapper;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface HealthMapper {

    public int checkHealth();

}
