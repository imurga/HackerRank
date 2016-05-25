package implementation;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		LinkedList<Integer> result = new LinkedList<Integer>();
		
		List<Integer> numLst = new LinkedList<Integer>();
		for (int arr_i = 0; arr_i < n; arr_i++) {
			numLst.add(in.nextInt());
		}

		while (numLst.size() > 0) {

			int pos = 0;
			int min = Collections.min(numLst);
			ListIterator<Integer> it = numLst.listIterator();
			
			while (it.hasNext()) {
				pos+=1;
				Integer integer = (Integer) it.next();
				integer = integer - min;
        		it.set(integer);
        		if (integer <= 0){
        			it.remove();
        		}
        		
			}
			result.add(pos);
		}

		for (Integer integer : result) {
			System.out.println(integer);
		}
	}
}
