package com.bridge;

public class Line {
	
	private double x;
	private double y;
	
	public Line() {
		
	}
	
	public Line(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}

	public boolean euals(Object obj) {
		
		if(null == obj) {
			return false;
		}
		else {
			if(obj instanceof Line) {
				Line s = (Line) obj;
				return this.x == s.x && this.y == s.y; 
			}
			return false;
		}
	}
	
	public String toString() {
		return " [ x: " + x + "y: + y + ]";
	}
}
