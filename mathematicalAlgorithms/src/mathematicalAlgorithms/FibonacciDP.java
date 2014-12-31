package mathematicalAlgorithms;

public class FibonacciDP {
	public static long[] arr = new long[100];
	public static void main(String[] args) {
		int n = 35;
		arr[0] = 0;
		arr[1] = 1;
		for(int i = 2; i < arr.length; i++) 
			arr[i] = -1;
		System.out.println("Term " + n + " in Fibonacci Sequence is " + fibonacciDP(n));
	}
	public static long fibonacciDP(int n) {
		if(arr[n] == -1) 
			arr[n] = fibonacciDP(n - 1) + fibonacciDP(n - 2);	
		return arr[n];
	}
}