package com.techelevator.shape;

public class Square implements Shape, Comparable<Shape> {

	private double length, width;

	public static final String SQUARE = "square";

	public Square(double length, double width) {

		this.length = length;
		this.width = width;

	}

	public String getName() {

		return "Square";

	}

	public double getArea() {

		return length * width;
	}

	public int compareTo(Shape otherShape) {

		if (this.getArea() == otherShape.getArea()) {

			return 0;
		}

		else if (this.getArea() < otherShape.getArea()) {

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
