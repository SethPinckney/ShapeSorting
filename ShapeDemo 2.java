package com.techelevator.shape;

import java.util.Arrays;

public class ShapeDemo {

	public static void main(String[] args) {

	}

	public static String RECTANGLE, SQUARE, CIRCLE, TRIANGLE;

	Shape[] shapes = new Shape[4];

	{

		shapes[0] = rectangle(20, 34);
		shapes[1] = square(7, 7);
		shapes[2] = circle(3.5, 22, 8);
		shapes[3] = triangle(3, 6);

		Arrays.sort(shapes);
		for (Shape s : shapes) {
			
			
	System.out.println("Now, in size order:" + name() + " has an area of " + area() + " ");
	System.out.println("");
	System.out.println("");
	System.out.println("Hey, that's a "+name());
		System.out.println("");
		System.out.print("Computing... ... ... ... ...");
		System.out.println("Okay, the area of your shape is " +area());
		System.out.println("");

		}

	// System.out.println(if the area of this shape is equal to the other
	// ShapeReturn 0 );
	// System.out.println (if the area of this shape is less than other
	// Shape Return -1 );
	// System.out.println(if the are of this shape is greater than other
	// Shape Return 1 );
