package com.springassign;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="rect")
    public Rectangle getRectangle() {
        return new Rectangle(15.5,25.5);
    }

    @Bean(name="pointA")
    public Point getPointA() {
        return new Point(0,0);
    }

    @Bean(name="pointB")
    public Point getPointB() {
        return new Point(15.5,0);
    }

    @Bean(name="pointC")
    public Point getPointC() {
        return new Point(0,25.5);
    }

    @Bean(name="pointD")
    public Point getPointD() {
        return new Point(15.5,25.5);
    }
    
    @Bean(name="points")
    public List<Point> getPoints(){
    	return Arrays.asList(getPointA(), getPointB(), getPointC(), getPointD());
    }
}


/*
 * For Accolite University,
 * 
 * Vishnu Singh Sengar
 */