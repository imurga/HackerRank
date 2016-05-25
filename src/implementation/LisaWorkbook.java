package implementation;

import java.util.Scanner;

public class LisaWorkbook {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int totalChapters = in.nextInt();
		int problemsPerPage = in.nextInt();
		int specialProblem = 0;
		int sumPage =1;
		for (int i = 0; i < totalChapters; i++) {
			int totalProblemPerChapter = in.nextInt();
			
			for (int problem=1 ; problem <=totalProblemPerChapter ; problem ++) {
				
	            if (sumPage == problem) {
	            	specialProblem+=1;
	            }
	            if (problem % problemsPerPage == 0){
	            	sumPage+=1;
	            }
	        }
			
	        if (totalProblemPerChapter % problemsPerPage != 0){
	        	sumPage+=1;
	        }
		}
		
		System.out.println(specialProblem);
	}
}
