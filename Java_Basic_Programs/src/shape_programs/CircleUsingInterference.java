package shape_programs;

import java.util.Scanner;

class Parent{
	public static final double PI = 3.14;
	double radius;
	
	public void areaCal(double r) {
		double area = PI * r * r;
		System.out.println("area is : "+area);
	}
}
 class CircleUsingInterference extends Parent{
	 public static void main(String args[]) {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter radius");
			double r = scan.nextDouble();
			CircleUsingInterference c = new CircleUsingInterference();
			c.areaCal(r);
		}
 }
	 		
	


