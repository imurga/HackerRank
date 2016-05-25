package implementation;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		Integer [] heightArr = new Integer[t];
		for (int a0 = 0; a0 < t; a0++) {
			int num = in.nextInt();
			String numStr = num + "";
			int count = 0;
			for (int i = 0; i < numStr.length(); i++) {
				int tmp = Character.getNumericValue(numStr.charAt(i));
				if (tmp != 0 && num % tmp == 0)
					count++;
			}
			heightArr[a0] = count;
		}
		
        for (int i = 0; i < heightArr.length; i++) {
			System.out.println(heightArr[i]);
		}
	}
}
