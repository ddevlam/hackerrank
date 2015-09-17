package danny.hxr;

import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String deliverDate = sc.nextLine();
        String expectedDate = sc.nextLine();

        String[] deliverSplit = deliverDate.split(" ");
        String[] expectedSplit = expectedDate.split(" ");

        int totalFine = 0;
        int deliverYear = Integer.parseInt(deliverSplit[2]);
        int expectedYear = Integer.parseInt(expectedSplit[2]);
        int deliverMonth = Integer.parseInt(deliverSplit[1]);
        int expectedMonth = Integer.parseInt(expectedSplit[1]);
        int deliverDay = Integer.parseInt(deliverSplit[0]);
        int expectedDay = Integer.parseInt(expectedSplit[0]);

        if(validDate(deliverYear, deliverMonth, deliverDay) && validDate(expectedYear, expectedMonth, expectedDay)){
            if(deliverYear > expectedYear){
                totalFine += 10000;
            } else {
                int monthsLate = (expectedMonth - deliverMonth) * -1;
                int daysLate = (expectedDay - deliverDay) * -1;

                if(monthsLate > 0 && deliverYear == expectedYear){
                    totalFine += monthsLate * 500;
                } else {
                    if (daysLate > 0 && deliverMonth == expectedMonth) {
                        totalFine += daysLate * 15;
                    }
                }
            }
        }

        System.out.println(totalFine);
    }

    private static boolean validDate(int year, int month, int day){
        return validYear(year) && validMonth(month) && validDay(day);
    }

    private static boolean validDay(int day){
        return 1 <= day && day <= 31;
    }
    private static boolean validMonth(int month){
        return 1 <= month && month <= 12;
    }

    private static boolean validYear(int year){
        return 1 <= year && year <= 3000;
    }
}
