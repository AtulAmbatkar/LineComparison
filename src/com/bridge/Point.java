package com.bridge;

public class Point {

	private double x ;
	private double y ;
	
	public Point() {
		
	}
	
	public Point(double x , double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public boolean equals(Object obj) {
		
		if(obj == null) {
			return false;
		}
		else if(this == obj) {
			return true;
		}
		else {
			if(obj instanceof Point p) {
				return this.x == p.x && this.y == p.y;
			}
		  return false;
		}
	}

	public String toString() {
		return " { x: "  + x + " y: " + y + " }" ;
	}
}
