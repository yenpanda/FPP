package Prog4;

public final class Rectangle {
	
	private double width;
	private double length;
	private double area;
	
	public Rectangle(double width, double length){
		this.width = width;
		this.length = length;
		this.area = this.width*this.length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

}
