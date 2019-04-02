package com.jacle.spboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 *Starter
 */

@SpringBootApplication
@EnableRedisHttpSession
@EnableScheduling
@EnableCaching
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);

    }

}
