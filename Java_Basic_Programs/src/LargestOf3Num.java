import java.util.Scanner;

public class LargestOf3Num {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 3 number");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		int temp;

		if (n1 > n2) {
			temp = n1;
		} else {
			temp = n2;
		}

		if (temp > n3) {
			System.out.println("greatest " + temp);
		} else {
			System.out.println("greatest " + n3);
		}
		scan.close();
	}

}
