package com.bridge;

public class Line {
	
	private Point startPoint;
	private Point endPoint ;
	
	public Line() {
		
	}
	
	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint= endPoint;
	}
	
	
	private double length() {
		double hrdX = endPoint.getX() - startPoint.getX();
		double vrdY = endPoint.getY() - startPoint.getY();
		
		return Math.sqrt(hrdX * hrdX + vrdY * vrdY);
	}
	
	public int compareTo(Line length) {
		return (int) (this.length() - length.length());
	}
	
	public String toString() {
		return " [ startPoint: " + startPoint + "endPoint: + endPoint + ]";
	}
}
