import java.util.Scanner;

public class Even_Number {

	// way 1 : ternary operator
	public static boolean isEvenUsingTO(int num) {
		boolean result = (num % 2 == 0) ? true : false;
		return result;
	}

	// way 2 : switch case

	public static boolean isEvenUsingSC(int num) {
		num = num % 2;
		switch (num) {
		case 0: {
			return true;

		}

		case 1: {
			return false;

		}

		default:
			return false;
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		//System.out.println(isEvenUsingTO(number));
		System.out.println(isEvenUsingSC(number));
	}

}
