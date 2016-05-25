package implementation;

import java.util.Scanner;

public class UtopianTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        Integer [] heightArr = new Integer[t];
        
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int height =1;
            
            //each test case has a cycle
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0)
                    height *= 2;
                else
                    height += 1;
			}
            heightArr[a0] = height;
        }
        
        for (int i = 0; i < heightArr.length; i++) {
			System.out.println(heightArr[i]);
		}
    }
}
