package mathematicalAlgorithms;

public class FibonacciDP {
	public static void main(String[] args) {
		int n = 25;
		System.out.println("Term " + n + " of the Fibonacci Sequence is: " + fibonacciDP(n));
	}
	public static long fibonacciDP(int n) {
		long back2 = 0, back1 = 1;
		long next = 0;
		if(n == 0)
			return 0;
		for(int i = 2; i < n; i++) {
			next = back1 + back2;
			back2 = back1;
			back1 = next;
		}
		return (back1 + back2);
	}
}