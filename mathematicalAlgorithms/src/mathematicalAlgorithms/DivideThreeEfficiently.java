package mathematicalAlgorithms;

public class DivideThreeEfficiently {
	public static void main(String[] args) {
		System.out.println("Is 10 multiple of 3? " + isMultipleOfThree(10));
		System.out.println("Is 612 multiple of 3? " + isMultipleOfThree(612));
	}
	public static boolean isMultipleOfThree(int n) {
		if(n < 0) n = -n;
		int evenCtr = 0;
		int oddCtr = 0;
		while (n != 0) {
			if ((n & 1) == 1)  
				oddCtr++;
			n = n>>1;
		if ((n & 1) == 1) 
			evenCtr++;
		n = n>>1;
		}
		return evenCtr == oddCtr;
	}   
}
