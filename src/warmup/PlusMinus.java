package warmup;

import java.util.Scanner;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double zero=0, pos=0, neg = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
        	int val = in.nextInt();
            if(val == 0){
            	zero +=1;
            }else if (val < 0 ){
            	neg+=1;
            }else{
            	pos+=1;
            }
        }
        
        System.out.println(pos/n);
        System.out.println(neg/n);
        System.out.println(zero/n);
    }
}
