package com.au.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.au.aop.model.Circle;
import com.au.aop.model.Triangle;
import com.au.aop.service.ShapeService;

public class AopMain {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("spring.xml");
		ShapeService shapeService = ctx.getBean("shapeservice", ShapeService.class);
		System.out.println(shapeService.getCircle().getName());
		Circle cir = ctx.getBean(Circle.class);
		cir.setName("Circle");
		cir.getName();
		shapeService.setCircle(cir);		
		Triangle tri = ctx.getBean(Triangle.class);
		shapeService.setTriangle(tri);
		tri.getName();
	}

}
