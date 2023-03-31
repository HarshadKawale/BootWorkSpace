package com.app.hk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("com.app.hk")
@PropertySource("classpath:ConfigProperties.properties")
public class AppConfig {

}
