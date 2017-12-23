package com.zdenek.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.util.List;

@Configuration
@PropertySource(value="classpath:config.properties")
public class AppConfigTest {

    @Value("#{'${server.name}'.split(',')}")
    private List<String> servers;

    @Value("#{'${server.id}'.split(',')}")
    private List<Integer> serverId;

    public String getTest() {
        return test;
    }

    @Value("${server.id}")
    private String test;

    //To resolve ${} in @Value
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public String ReadProperties(){
        return "in ReadProperties " + servers.toString();
       //return "in ReadProperties" + servers + " : " + serverId;
    }

    public String prase (){
        return serverId.toString();
    }
}