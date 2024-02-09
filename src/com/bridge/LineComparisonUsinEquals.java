package com.bridge;

import java.util.Scanner;

public class LineComparisonUsinEquals {

	public static void main(String [] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter line1 co-ordinates (x,y) : ");
		double x1= scn.nextDouble();
		double y1 = scn.nextDouble();
		
		System.out.print("Enter line2 co-ordinates (x,y) : ");
		double x2 = scn.nextDouble();
		double y2 = scn.nextDouble();
		
		Line line1 = new Line(x1,y1);
		Line line2 = new Line(x2,y2);
		
		if(line1.euals(line2)) {
			System.out.println("Both line are euals ");
		}else {
			System.out.println("BOth line are not euals: ");
		}
	}
}
