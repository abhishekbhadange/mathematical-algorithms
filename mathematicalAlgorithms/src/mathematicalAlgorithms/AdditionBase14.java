package mathematicalAlgorithms;

public class AdditionBase14 {
	public static void main(String[] args) {
		String str1 = "D09";
		String str2 = "7BA";
		int n = str1.length();
		char[] res = new char[n + 1];
		System.out.println("Addition result: " + additionBase14(str1, str2, res));
	}
	public static String additionBase14(String str1, String str2, char[] res) {
		int n1 = str1.length();
		int n2 = str2.length();
		if(n1 != n2) {
			System.out.println("Numbers are not equal in size!");
			return null;
		}
		int carry = 0;
		for(int i = n1 - 1; i >= 0; i--) {
			int num1 = getNumericalValue(str1.charAt(i));
			if(num1 == Integer.MIN_VALUE) {
				System.out.println("Error in fetching the numerical value of first number!");
				return null;
			}
			int num2 = getNumericalValue(str2.charAt(i));
			if(num2 == Integer.MIN_VALUE) {
				System.out.println("Error in fetching the numerical value of second number!");
				return null;
			}
			int sum = num1 + num2 + carry;
			if(sum >= 14) {
				carry = 1;
				sum = sum - 14;	
			}
			else
				carry = 0;
			if((res[i + 1] = getNumeral(sum)) == Character.MIN_VALUE) {
				System.out.println("Error in fetching the character value of result!");
				return null;
			}
		}
		if(carry == 1)
			res[0] = '1';
		else
			res[0] = ' ';
		return new String(res);
	}
	public static int getNumericalValue(char ch) {
		if(ch >= '0' && ch <= '9')
			return (ch - '0');
		if(ch >= 'A' && ch <= 'D')
			return (ch - 'A' + 10);
		return Integer.MIN_VALUE;
	}
	public static char getNumeral(int res) {
		if(res >= 0 && res <= 9)
			return (char)(res + '0');
		if(res >= 10 && res <= 14)
			return (char)(res + 'A' - 10);
		return Character.MIN_VALUE;
	} 
}