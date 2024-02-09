package com.bridge;

import java.util.Scanner;

public class LengthCompareTo {
	
	private double startPoint;
	private double endPoint;
	
    public LengthCompareTo() {
    	
    }
    
    public LengthCompareTo(double startPoint , double endPoint) {
    	this.startPoint = startPoint;
    	this.endPoint = endPoint;
    }
    
    public double getStartPoint() {
    	return startPoint;
    }
    
    public double getEndPoint() {
    	return endPoint;
    }
    
    public int compareTo(LengthCompareTo length) {
    	double length1 = this.endPoint - this.startPoint;
    	double length2 = length.endPoint - length.startPoint;
    	
    	if(length1 == length2 )
    		return 0;
    	else if(length1 < length2)
    		return -1;
    	else 
    		return 1;
    }
    
    public static void main(String [] args) {
    	
    	Scanner scn = new Scanner(System.in);
    	
    	System.out.print("Enter first Line Point (x1,y1):  ");
    	double x1 = scn.nextDouble();
    	double y1 = scn.nextDouble();
    	
    	System.out.print("Enter Second Line POint (x2,y2) : ");
    	double x2 = scn.nextDouble();
    	double y2 = scn.nextDouble();
    	
    	LengthCompareTo length1 = new LengthCompareTo(x1,y1);
    	LengthCompareTo length2 = new LengthCompareTo(x2,y2);
    	
    	int comparison = length1.compareTo(length2);
    	
    	if(comparison == 0) {
    		System.out.println("line is eual");
    	}
    	else if(comparison > 0) {
    		System.out.println("length1 is greater than length2 ");
    	}
    	else {
    		System.out.println("length1 is less than length2 "); 
    	}
    	
    	
    }

}
