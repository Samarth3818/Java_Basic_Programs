import java.util.Scanner;

public class PrimeNumberUsingWhileLoop {

	public static void primeNumber(int num) {
		int i=1;
		int count = 0;
		while(i<=num) {
			if(num%i == 0) {
				count++;
			}
			i++;
		}
		if(count == 2) {
			System.out.println("prime");
		}else {
			System.out.println("not a prime");
		}
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		primeNumber(num);
	}
}
