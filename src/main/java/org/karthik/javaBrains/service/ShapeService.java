package org.karthik.javaBrains.service;

import org.karthik.javaBrains.model.Circle;
import org.karthik.javaBrains.model.Triangle;

public class ShapeService {

	private Triangle triangle;
	private Circle circle;
	
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
}
