package Prog4;

final public class Triangle {

	private double base; 
	private double height;
	private double area;
	
	Triangle(double base, double height){
		this.base = base;
		this.height = height;
		this.area = this.base*this.height/2;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	
}
