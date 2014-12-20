package mathematicalAlgorithms;

public class MultiplySevenEfficiently {
	public static void main(String[] args) {
		int n = 5;
		System.out.println("5 * 7 = " + multiplySevenEfficiently(n));
		n = 11;
		System.out.println("11 * 7 = " + multiplySevenEfficiently(n));
	}
	public static int multiplySevenEfficiently(int n) {
		return ((n << 3) - n);
	}
}