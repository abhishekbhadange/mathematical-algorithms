package mathematicalAlgorithms;

public class EffiPowerFunction {
	public static void main(String[] args) {
		int base = 9, exp = 4;
		System.out.println("Efficient Power computation result: " + effiPowerFunction(base, exp));
		System.out.println("Exponentiation by squaring result: " + expBySquaring(base, exp));
	}
	public static long effiPowerFunction(int base, int exp) {
		if(exp == 0)
			return 1;
		if(exp == 1)
			return base;
		long result = 1;
		while(exp != 0) {
			if((exp & 1) != 0)
				result *= base;
			exp >>= 1;
			base *= base;
		}
		return result;
	}
	public static int expBySquaring(int base, int exp) {
		if(exp == 0)
			return 1;
		else if(exp == 1)
			return base;
		else if(exp % 2 == 0)
			return expBySquaring(base*base, exp/2);
		else
			return base * expBySquaring(base*base, (exp - 1)/2);
	}
}