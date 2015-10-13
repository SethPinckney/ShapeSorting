package com.techelevator.shape;

public class Circle implements Shape, Comparable<Shape> {

	double radius = 0;

	private double area = Math.PI * (radius * radius);

	public static final String CIRCLE = "circle";

	public Circle(double radius) {

		this.radius = radius;

	}

	public String getName() {

		return "Circle";

	}

	public double getArea() {

		return Math.PI * (radius * radius);
	}

	public int compareTo(Shape otherShape) {

		if (this.area == otherShape.getArea()) {

			return 0;
		}

		else if (this.area < otherShape.getArea()) {

			return -1;
		}

		else {

			return 1;
		}

		// return 0; if the area of this shape is equal to other shape
		// return -1 if the area of this shape is less than other shape
		// return 1 if the area of this shape is greater than the other shape

	}
}
