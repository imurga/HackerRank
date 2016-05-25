package warmup;

import java.math.BigInteger;
import java.util.Scanner;

public class VeryBigSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger sum = BigInteger.ZERO;
        for(int arr_i=0; arr_i < n; arr_i++){
        	sum = sum.add(in.nextBigInteger());
        }
        
        System.out.println(sum);
    }
}
