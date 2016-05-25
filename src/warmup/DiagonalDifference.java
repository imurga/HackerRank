package warmup;

import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int firstDiag = 0;
        int secondDiag = 0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
            	int val = in.nextInt();
                if(a_i == a_j)
                	firstDiag +=val;
                
                if(a_i + a_j == n-1)
                	secondDiag +=val;
            }
        }
        System.out.println(Math.abs((firstDiag - secondDiag)));
    }
}
