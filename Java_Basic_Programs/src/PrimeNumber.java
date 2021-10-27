import java.util.Scanner;

public class PrimeNumber {

	//using static method
	public static void primeCheck(int num) {
		
		int count = 0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("prime ");
			
		}else {
			System.out.println("not prime");
		}
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		primeCheck(num);
	}
}
