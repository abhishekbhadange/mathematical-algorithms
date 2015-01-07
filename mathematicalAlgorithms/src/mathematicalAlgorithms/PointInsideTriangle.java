package mathematicalAlgorithms;

public class PointInsideTriangle{
	public static void main(String[] args) {
		if(isInside(0, 0, 20, 0, 10, 30, 30, 15))
			System.out.println("Inside");
		else
			System.out.println("Not inside");
	}
	public static boolean isInside(int x1, int y1, int x2, int y2, int x3, int y3, int x, int y) {
		float area = getArea(x1, y1, x2, y2, x3, y3);
		float area1 = getArea(x1, y1, x2, y2, x, y);
		float area2 = getArea(x2, y2, x3, y3, x, y);
		float area3 = getArea(x3, y3, x1, y1, x, y);
		if((area1 + area2 + area3) == area)
			return true;
		else
			return false;
	} 
	public static float getArea(int x1, int y1, int x2, int y2, int x3, int y3) {
		return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2);
	}
}