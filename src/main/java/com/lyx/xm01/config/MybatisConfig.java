package com.lyx.xm01.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.lyx.xm01.dao")
public class MybatisConfig {
}
