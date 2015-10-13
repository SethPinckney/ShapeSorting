package com.techelevator.shape;

public class Triangle implements Shape, Comparable<Shape> {

	double base = 0;
	double height = 0;

	private double area = base * height / 2;

	public static final String TRIANGLE = "triangle";

	public Triangle(double base, double height) {

		this.base = base;
		this.height = height;

	}

	public String getName() {

		return "Triangle";

	}

	public double getArea() {

		return (base * height) / 2;
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

		// if the area of this shape is equal to other shape
		// return -1 if the area of this shape is less than other shape
		// return 1 if the area of this shape is greater than the other shape
	}
}
