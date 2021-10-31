import java.util.Scanner;

public class FibonacciSeriesUsingWhileLoop {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number of terms");
		int num = scan.nextInt();
		int i = 0;
		int first = 0;
		int second = 1;
		while(i<num) {
			if(i<=1) {
				System.out.print(i+" ");
			}else {
				
				int temp = first + second;
				System.out.print(temp+" ");
				first = second;
				second = temp;
				
			}
			i++;
		}
		
		
		}
		
	}


