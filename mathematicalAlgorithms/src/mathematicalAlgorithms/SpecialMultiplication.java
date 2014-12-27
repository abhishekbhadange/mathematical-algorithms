// Multiply two integers without using multiplication, division, bitwise operators and no loops

package mathematicalAlgorithms;

public class SpecialMultiplication {
	public static void main(String[] args) {
		System.out.println("Multiplication result of (2, 5): " + specialMultiply(2, 5));
		System.out.println("Multiplication result of (-3, 7): " + specialMultiply(-3, 7));
		System.out.println("Multiplication result of (4, -9): " + specialMultiply(4, -9));
	}
	private static int specialMultiply(int x, int y) {
		if(y == 0)
			return 0;
		else if(y > 0)
			return (x + specialMultiply(x, y - 1));
		else
			return -specialMultiply(x, -y);
	}
}