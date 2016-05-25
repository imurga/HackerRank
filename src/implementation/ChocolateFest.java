package implementation;

import java.util.LinkedList;
import java.util.Scanner;

public class ChocolateFest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		LinkedList<Long> result = new LinkedList<Long>();
		for (int a0 = 0; a0 < t; a0++) {
			long n = in.nextLong();
			long c = in.nextLong();
			long m = in.nextLong();

			long numChoc = n / c;

			long free = numChoc / m;

			long remain = numChoc % m;
			
			long total = free + numChoc;

	        while((remain+free)/m>=1 && remain>0){
	            free = (remain + free)/m;
	            remain = (remain + free)%m;
	            total =total+free;
	        } 
	        result.add(total);
		}
		
		for (Long val : result) {
			System.out.println(val);
		}
	}
}
