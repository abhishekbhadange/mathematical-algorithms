package mathematicalAlgorithms;

public class PowerFunction {
	public static void main(String[] args) {
		int number = 5;
		int power = 4;
		System.out.println("Result: " + powerFunction(number, power));
		System.out.println("Recursive result: " + recPower(number, power));
	}
	public static int powerFunction(int num, int pow) {
		if(pow == 0)
			return 1;
		int answer = num;
		int increment = num;
		for(int i = 1; i < pow; i++) {
			for(int j = 1; j < num; j++) {
				answer += increment;
			}
			increment = answer;
		}
		return answer;
	}
	public static int recPower(int num, int pow) {
		if(pow == 0)
			return 1;
		else
			return multiply(num, recPower(num, pow - 1));
	}
	public static int multiply(int x, int y) {
		if(y == 1)
			return x;
		else
			return x + multiply(x, y - 1);
	}
}