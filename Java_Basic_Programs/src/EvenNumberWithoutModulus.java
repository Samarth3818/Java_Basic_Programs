import java.util.Scanner;

public class EvenNumberWithoutModulus {

	// way 1 : ternary operator
	public static boolean isEvenUsingTO(int num) {
		boolean result = ((num / 2) * 2 == num) ? true : false;
		return result;
	}

	


	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println(isEvenUsingTO(number));
		//System.out.println(isEvenUsingSC(number));
	}

}
