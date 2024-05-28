package Areas;

public class Rectangle {
	double length,breadth;

	public Rectangle(double length,double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public void printArea() {
		double area = length*breadth;
		System.out.print("Area: "+area);
	}
	public void printParameter() {
		double parameter = 2*(length+breadth);
		System.out.println("\nParameter: "+parameter);
	}
	
}
