// Given a sorted array, find the frequency of an element x in the array

package mathematicalAlgorithms;

public class Frequency {
	public static void main(String[] args) {
		int[] a = {2, 4, 5, 6, 7, 8, 9, 10, 10};
		int x = 10;
		boolean isLeft = true;
		int left = findIndex(a, x, 0, a.length - 1, isLeft);
		System.out.println("Left: " + left);
		if(left == Integer.MIN_VALUE) {
			System.out.println("Element does not exists!");
			return;
		}
		isLeft = false;
		int right = findIndex(a, x, 0, a.length - 1, isLeft);
		System.out.println("Right: " + right);
		System.out.println("Frequency of " + x + " in the array is: " + (right - left + 1));
		System.out.println("\n------Iterative Method------");
		isLeft = true;
		left = findIterIndex(a, x, 0, a.length - 1, isLeft);
		System.out.println("Left: " + left);
		if(left == Integer.MIN_VALUE) {
			System.out.println("Element does not exists!");
			return;
		}
		isLeft = false;
		right = findIterIndex(a, x, 0, a.length - 1, isLeft);
		System.out.println("Right: " + right);
		System.out.println("Frequency of " + x + " in the array is: " + (right - left + 1));
	}
	public static int findIndex(int[] a, int x, int start, int end, boolean isLeft) {
		if(start > end)
			return Integer.MIN_VALUE;
		int mid = (start + end) / 2;
		if(x < a[mid])
			return findIndex(a, x, start, mid - 1, isLeft);
		else if(x > a[mid])
			return findIndex(a, x, mid + 1, end, isLeft);
		else {
			if(isLeft) {
				if(mid == 0 && a[mid] == x)
					return mid;
				else if(mid != 0 && a[mid - 1] != x)
					return mid;
				else 
					return findIndex(a, x, start, mid - 1, isLeft);
			}
			else {
				if(mid == (a.length - 1) && a[mid] == x) 
					return mid;
				else if(mid != (a.length - 1) && a[mid + 1] != x)
					return mid;
				else
					return findIndex(a, x, mid + 1, end, isLeft);
			}
		}
	}
	public static int findIterIndex(int[] a, int x, int start, int end, boolean isLeft) {
		while(start <= end) {
			int mid = (start + end) / 2;
			if(x < a[mid])
				end = mid - 1;
			else if(x > a[mid])
				start = mid + 1;
			else {
				if(isLeft) {
					if(mid == 0 && a[mid] == x)
						return mid;
					else if(mid != 0 && a[mid - 1] != x)
						return mid;
					else
						end = mid - 1;
				}
				else {
					if(mid == (a.length - 1) && a[mid] == x) 
						return mid;
					else if(mid != (a.length - 1) && a[mid + 1] != x)
						return mid;
					else
						start = mid + 1; 
				}
			}
		}
		return Integer.MIN_VALUE;
	}
}