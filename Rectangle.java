package com.techelevator.shape;

public class Rectangle implements Shape, Comparable<Shape> {

	private double length, width;

	public static final String RECTANGLE = "rectangle";

	public Rectangle(double length, double width) {

		this.length = length;
		this.width = width;

	}

	public String getName() {

		return "Rectangle";

	}

	public double getArea() {

		return  length * width;
	}

	public int compareTo(Shape otherShape) {

		if (this.getArea( )== otherShape.getArea()) {

			return 0;
		}

		else if (this.getArea() < otherShape.getArea()) {

			return -1;
		}

		else {

			return 1;
		}

		// if the area of this shape is equal to other shape return 0
		// if the area of this shape is less than other shape return -1
		// if the area of this shape is greater than the other shape return 1
	}
}
