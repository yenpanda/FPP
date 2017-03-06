package Prog4;

public final class Circle {
	private static double pi = 3.14;
	private double radius;
	private double area;
	
	Circle(double radius){
		this.radius = radius;
		this.area = this.pi*this.radius*this.radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

}
