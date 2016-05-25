package implementation;

import java.util.Scanner;


public class ServiceLane {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        int result[] = new int[t];
        for(int width_i=0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < t; a0++){
            int i = in.nextInt();
            int j = in.nextInt();
            
            int min = 3;
            for(int a1=i;a1<=j;a1++){
                if(width[a1]<min){
                    min = width[a1];
                }
            }
            result[a0]=min;
        }
        
        for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
    }
}
