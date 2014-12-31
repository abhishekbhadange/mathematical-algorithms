package mathematicalAlgorithms;

public class FibonacciC {
	public static long[] arr = new long[100];
	public static void main(String[] args) {
		int n = 35;
		arr[0] = 0;
		arr[1] = 1;
		for(int i = 2; i < arr.length; i++) 
			arr[i] = -1;
		System.out.println("Term " + n + " in Fibonacci Sequence is " + fibonacciC(n));
	}
	public static long fibonacciC(int n) {
		if(arr[n] == -1) 
			arr[n] = fibonacciC(n - 1) + fibonacciC(n - 2);	
		return arr[n];
	}
}