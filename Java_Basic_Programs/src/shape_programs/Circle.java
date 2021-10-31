package shape_programs;

import java.util.Scanner;

public class Circle {
	public static final double PI = 3.14;
	public static void computeArea(int r) {
		double area = PI * r * r;
		System.out.println("area is "+area);
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter radius");
		int r = scan.nextInt();
		computeArea(r);
		scan.close();
	}

}
