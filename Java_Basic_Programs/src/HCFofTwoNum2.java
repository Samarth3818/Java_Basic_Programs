import java.util.*;

public class HCFofTwoNum2 {
	static int findHCF(int n1, int n2) {
		while(n1 != n2) {
			if(n1>n2) {
				n1 = n1 - n2;
			}
			n2 = n2 - n1;
		}
		return n2;
		
		
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		
		System.out.println(findHCF(number1,number2));
		
		
	}

}
