package mathematicalAlgorithms;

public class NumbersWithoutThree {
	public static void main(String[] args) {
		int n = 10;
		System.out.println("Numbers from 1 to " + n + " that don't contain digit 3: " + numbersWithoutThree(n));
	}
	public static int numbersWithoutThree(int n) {
		int temp = 0, count = 0;
		for(int i = 1; i <= n; i++) {
			temp = i;
			while(temp != 0) {
				if(temp % 10 == 3) {
					count++;
					break;
				}
				temp = temp / 10;
			}
		}
		return n - count;
	}
}