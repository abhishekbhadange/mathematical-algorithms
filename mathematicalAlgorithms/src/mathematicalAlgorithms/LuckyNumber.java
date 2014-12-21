package mathematicalAlgorithms;

public class LuckyNumber {
	public static int counter = 2;
	public static void main(String[] args) {
		int n = 11;
		System.out.println("Is 11 a lucky number? " + isLuckyNumber(n));
		counter = 2;
		n = 39;
		System.out.println("Is 39 a lucky number? " + isLuckyNumber(n));
	}
	public static boolean isLuckyNumber(int n) {
		int nextPosition = n;
		if(counter > nextPosition)
			return true;
		if(nextPosition % counter == 0)
			return false;
		nextPosition = nextPosition - nextPosition / counter;
		counter++;
		return isLuckyNumber(nextPosition);
	}
}