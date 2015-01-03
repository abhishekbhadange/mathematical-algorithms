package mathematicalAlgorithms;

public class EffiPowerFunction {
	public static void main(String[] args) {
		int number = 9, base = 3;
		System.out.println("Efficient Power computation result: " + effiPowerFunction(number, base));
	}
	public static long effiPowerFunction(int base, int exp) {
		if(exp == 0)
			return 1;
		long result = 1;
		while(exp != 0) {
			if((exp & 1) != 0)
				result *= base;
			exp >>= 1;
			base *= base;
		}
		return result;
	}
}