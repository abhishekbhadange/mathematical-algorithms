package mathematicalAlgorithms;

import java.util.List;
import java.util.ArrayList;

public class LuckyNumbers {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= 10; i++) {
			list.add(i);
		}
		luckyNumbers(list);
	}
	public static void luckyNumbers(List<Integer> list) {
		for(int i = 1; i < list.size(); i++) {
			int k = i;
			int count = list.get(i);
			while(k < list.size()) {
				int j = list.get(k);
				list.remove((Integer)j);
				k += count;
			}
		}
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}