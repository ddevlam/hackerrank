package danny.hxr;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dateAsText = sc.next();

        String date = dateAsText.substring(0, 8);
        String[] timeElements = date.split(":");

        String amOrPm =  dateAsText.substring(8, 10);

        String hour = timeElements[0];
        String minutes = timeElements[1];
        String seconds = timeElements[2];

        if("PM".equals(amOrPm)){
            int hourAsInt = Integer.parseInt(hour);
            if(hourAsInt < 12){
                hour = "" + (hourAsInt + 12);
            }
        } else {
            if("12".equals(hour)){
                hour = "00";
            }
        }

        System.out.println(String.format("%s:%s:%s", hour, minutes, seconds));
    }

}
