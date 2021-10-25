import java.util.*;

public class LCMofTwoNum {
	static int findLCM(int n1, int n2) {
		int smallest = (n1>n2) ? n2 : n1;
		int largest = (n1>n2) ? n1 : n2;
		
		int minMul = smallest;
		
		while(true) {
			if(minMul % largest == 0) {
				return minMul;
			}
			minMul += smallest;
		}
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		
		System.out.println(findLCM(number1,number2));
		
		
	}

}
