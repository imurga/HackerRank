package warmup;

import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
        	String line = "";
        	int blankSpace = (n-1)-i;
        	for (int j = 0; j < blankSpace; j++) {
        		line+=" ";
			}
        	
        	for (int j = 0; j < n-blankSpace; j++) {
        		line+="#";
			}
        	
			System.out.println(line);
		}
    }
}
