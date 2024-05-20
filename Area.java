package hw1;
import java.util.*;
public class Area {
	private double length,width;
	
	public void setDim(double length,double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getArea() {
		return length * width;
	}
	public static void main(String args[]) {
		Area rectangle  = new Area();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of rectangle: ");
		double length = sc.nextDouble();
		System.out.print("Enter width of rectangle: ");
		double width = sc.nextDouble();
		
		rectangle.setDim(length, width);
		
		System.out.print("Area of rectangle: "+rectangle.getArea());
		
		sc.close();
	}
}
