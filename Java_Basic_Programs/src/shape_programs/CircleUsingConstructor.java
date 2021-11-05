package shape_programs;

import java.util.Scanner;

class Area{
	double area;
	final Double PI = 3.14;
	
	//constructor
	Area(double r){
		area = PI * r * r;
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter radius");
		double r = scan.nextDouble();
		Area a = new Area(r);
		System.out.println("area" + a);
		scan.close();
	}
}
	 		
	


