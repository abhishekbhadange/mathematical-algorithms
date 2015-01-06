package mathematicalAlgorithms;

public class StreamAverage {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60};
		streamAverage(arr);
	}
	public static void streamAverage(int[] arr) {
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			temp += arr[i];
			float avg = temp/(i + 1);
			System.out.printf("Average of " + (i+1) + " number(s) is %.2f\n", avg);
		}
	}
}