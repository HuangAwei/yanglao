package com.tzh.manage.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.tzh.manage.mapper")
public class ManageConfig {
}
