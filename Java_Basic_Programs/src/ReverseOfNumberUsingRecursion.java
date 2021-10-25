import java.util.Scanner;

public class ReverseOfNumberUsingRecursion {
	static int lastDigit;
	static int reverse=0;
	public static int findReverse(int num) {

		
		
		while(num != 0) {
			lastDigit = num % 10;
			reverse = reverse * 10 + lastDigit;
			return findReverse(num/10);
		}
		return reverse;
		
		
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(findReverse(num));
	}
}
