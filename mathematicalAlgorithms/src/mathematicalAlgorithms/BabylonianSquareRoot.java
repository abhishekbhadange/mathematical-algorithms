package mathematicalAlgorithms;

public class BabylonianSquareRoot {
	public static void main(String[] args) {
		int n = 81;
		System.out.println("Square root of " + n + " is " + squareRoot(n));
	}
	public static float squareRoot(int n) {
		float x = n;
 		float y = 1;
  		double e = 0.000001; 
  		while(x - y > e)
  		{
    		x = (x + y)/2;
    		y = n/x;
  		}
  		return x;
	}
}