package Areas;

public class Main {
	public static void main(String args[]) {
		Rectangle r = new Rectangle(5,3);
		System.out.println("Rectangle: ");
		r.printArea();
		r.printParameter();
		
		System.out.println("\n");
		
		Squre s = new Squre(4);
		System.out.println("Squre: ");
		s.printArea();
		s.printParameter();
	}

}
