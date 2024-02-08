package com.bridge;

import java.util.Scanner;

public class LineLengthCalculate {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
//		user input
		System.out.print("Enter the co-ordinate of first point (x1,y1): ");
		double x1 = scn.nextDouble();
		double y1 = scn.nextDouble();
		
		System.out.print("Enter the co-ordinate of Second point(x2,y2): ");
		double x2 = scn.nextDouble();
		double y2 = scn.nextDouble();
		
//		calculate length
		double lenght = calCulateLength(x1,y1,x2,y2);
		
//		print calculated legth
		System.out.println("Length of the Line : " + lenght);
		
		scn.close();
	}

//	length calculate method
	private static double calCulateLength(double x1, double y1, double x2, double y2) {
		
		double htdbX = x2-x1;
		double htdbY = y2-y1;

		return Math.sqrt(htdbX * htdbX + htdbY * htdbY);
	}

}
