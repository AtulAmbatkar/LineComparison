package com.bridge;

import java.util.Scanner;

public class LineComparisonusingComEqul {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the co-ordinate of firstLine Firstpoint (x1,y1): ");
		double x1 = scn.nextDouble();
		double y1 = scn.nextDouble();
		
		Point startPoint1 = new Point(x1,y1);
		
		System.out.print("Enter the co-ordinate of firstLine Secondoint (x1,y1): ");
		double x2 = scn.nextDouble();
		double y2 = scn.nextDouble();
		
		Point endPoint1 = new Point(x2,y2);
		
		System.out.print("Enter the co-ordinate of SecondLine Firstpoint (x1,y1): ");
		double x3 = scn.nextDouble();
		double y3 = scn.nextDouble();
		
		Point startPoint2 = new Point(x2,y2);
		
		System.out.print("Enter the co-ordinate of SecondLine Secondpoint (x1,y1): ");
		double x4 = scn.nextDouble();
		double y4 = scn.nextDouble();
		
		Point endPoint2 = new Point(x2,y2);
		
		Line line1 = new Line(startPoint1,endPoint1); 
		Line line2 = new Line(startPoint2,endPoint2); 
		
		int comparison = line1.compareTo(line2);
		
		if(comparison == 0) {
			System.out.println("Both Line are quals");
		}
		else if(comparison < 0) {
			System.out.println("Line1 in less than Line2: ");
		}
		else {
			System.out.println("Line1 is gerter than Line2: ");
		}
	}

}
