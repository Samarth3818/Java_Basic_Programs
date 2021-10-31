import java.util.Scanner;

public class FibonacciSeriesUsingStaticMethod {
	
	public static void computeFibo(int num) {
		int first = 0;
		int second = 1;
		for(int i=0; i<num; i++) {
			if(i<=1) {
				System.out.print(i+" ");
			}else if(i>1) {
				int temp = first + second;
				System.out.print(temp+" ");
				first = second;
				second = temp;
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number of terms");
		int num = scan.nextInt();
		computeFibo(num);
		scan.close();
			
		
		
	}

}
