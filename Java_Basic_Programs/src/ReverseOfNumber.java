import java.util.Scanner;

public class ReverseOfNumber {
	public static int findReverse(int num) {

		   // variable to store last digit
		   int lastDigit ;
		   // declare a temporary variable and
		   // initialize it with 0
		   int reverse = 0;

		   // loop to repeat the process
		   while(num != 0) {

		      // find last digit of number
		      lastDigit = num % 10;

		      // multiply temporary variable by 10
		      reverse = reverse * 10;

		      // add last digit to reverse variable
		      reverse = reverse + lastDigit;

		      // remove last digit
		      num = num / 10;
		   }

		   return reverse;
		}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(findReverse(num));
	}
}
