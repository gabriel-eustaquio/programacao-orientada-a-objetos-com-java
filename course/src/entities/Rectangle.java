package entities;

public class Rectangle {
	public double width;
	public double height;
	
	public double area() {
		return this.width * this.height;
	}
	
	public double perimeter() {
		return this.width * 2.0 + this.height * 2.0;
	}
	
	public double diagonal() {
		double aux = this.width * this.width + this.height * this.height;
		return Math.sqrt(aux);
	}
	
	public String toString() {
		return "AREA = " 
			+ String.format("%.2f %n", area())
			+ "PERIMETER = "
			+ String.format("%.2f %n", perimeter())
			+ "DIAGONAL = "
			+ String.format("%.2f %n", diagonal());
	}
	
}
