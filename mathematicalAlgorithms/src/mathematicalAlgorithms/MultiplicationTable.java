package mathematicalAlgorithms;

public class MultiplicationTable {
	public static void main(String[] args) {
		int size = 12;
		System.out.println("Grade-school multiplication table of size " + size + "x" + size + " is:\n");
		multiTable(size);
	}
	public static void multiTable(int size) {
		for(int i = 1; i <= size; i++) {
			for(int j = 1; j <= size; j++) {
				System.out.print(String.format("%4d", i * j));
			}
			System.out.println();
		}
	}
}