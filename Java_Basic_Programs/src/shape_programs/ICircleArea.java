package shape_programs;

import java.util.Scanner;

public interface ICircleArea {
	public void computeArea(double r);

}


class Circleimpl implements ICircleArea{
	
	public void computeArea(double r) {
		final double PI = 3.14;
		double area = PI * r * r;
		
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter radius");
		double r = scan.nextDouble();
		Circleimpl circle = new Circleimpl();
		circle.computeArea(r);
	}
	
	
}
