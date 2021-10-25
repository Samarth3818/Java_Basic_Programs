import java.util.*;

public class LCMofTwoNum2UsingRecursion {
	static int com;
	static int findLCM(int n1, int n2) {
		
		com = com + n2;
		if(com % n1 == 0) {
			return com;
		}
		return findLCM(n1,n2);
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		
		System.out.println(findLCM(number1,number2));
		
		
	}

}
