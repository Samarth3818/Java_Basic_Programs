import java.util.Scanner;

public class EvenNumberWithinRange {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter min range ");
		int min = scan.nextInt();
		System.out.println("enter max range");
		int max = scan.nextInt();
		for(int i=min; i<=max; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		
	}

}
