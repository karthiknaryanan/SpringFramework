package org.karthik.javaBrains;

import org.karthik.javaBrains.model.Triangle;
import org.karthik.javaBrains.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService obj = ctx.getBean("shapeService",ShapeService.class);
		System.out.println(obj.getTriangle().getName());
	}

}
