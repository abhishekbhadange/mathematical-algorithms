package mathematicalAlgorithms;

import java.util.Arrays;

public class Mode {
	public static void main(String[] args) {
		int[] arr = {5, 9, 6, 5, 3, 5, 1, 9, 2};
		mode(arr);
	}
	public static void mode(int[] arr) {
		int ctr = 1, mode = Integer.MIN_VALUE, modeFreq = 0;
		Arrays.sort(arr);
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] == arr[i + 1]) 
				ctr++;
			else {
				if(ctr > modeFreq) {
					modeFreq = ctr;
					mode = arr[i];
				}
				ctr = 1;
			}
		}
		if(ctr > modeFreq) {
			modeFreq = ctr;
			mode = arr[arr.length - 1];
		}
		System.out.println("Mode: " + mode + "\nFrequency: " + modeFreq);
	}
}