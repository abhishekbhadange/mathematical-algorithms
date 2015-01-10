package mathematicalAlgorithms;

public class SieveOfEratosthenes {
	public static void main(String[] args) {
		int n = 30;
		System.out.println("All prime numbers smaller than or equal to " + n + " are:");
		sieveOfEratosthenes(n);
	}
	public static void sieveOfEratosthenes(int n) {
		// There are no prime numbers smaller than 2
		if(n >= 2) {
			boolean[] arr = new boolean[n];
			for(int i = 0; i < n; i++)
				arr[i] = true;
			for(int i = 1; i < n; i++) {
				if(arr[i]) {
					// (i+1) is prime, print it and mark its multiples
					System.out.print((i + 1) + " ");
					markMultiples(arr, i + 1, n);
				}
			}
		}
	}
	public static void markMultiples(boolean[] arr, int a, int n) {
		int i = 2, num;
		while((num = i * a) <= n) {
			// minus 1 because index starts from 0
			arr[num - 1] = false;
			i++;
		}
	}
}