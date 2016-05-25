package implementation;

import java.util.Scanner;

public class AngryProfessor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String [] answer = new String[t];
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int ontime =0;
            for(int a_i=0; a_i < n; a_i++){
            	if(in.nextInt() <= 0){
            		ontime+=1;
            	}
            }
            if(ontime >= k){
            	answer[a0] = "NO";
            }
            else {
            	answer[a0] = "YES";
			}
        }
        
        for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
    }
}
