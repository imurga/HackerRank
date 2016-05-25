package warmup;

import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        
        String [] date = time.split(":");
        
        int hours = Integer.parseInt(date[0]);
        
        if((time.contains("PM") ||time.contains("pm"))){
        	if(hours != 12)
        		hours+=12;
        }else if(hours == 12){
        	hours = 0;
        }
        
        String hoursStr = String.valueOf(hours);
        if(hours<10)
        	hoursStr ="0"+hoursStr;
        
        System.out.println(hoursStr + time.substring(2, 8));
    }
}
