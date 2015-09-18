package danny.hxr;

import java.io.IOException;
import java.util.Scanner;

public class AngryProfessor {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int nrOfTestCases = Integer.parseInt(sc.nextLine()); // T

        if(1 <= nrOfTestCases && nrOfTestCases <= 10) {
            for(int i = 0; i < nrOfTestCases; i++){
                String canceled = isClassCanceled(sc) ? "NO" : "YES";
                System.out.println(canceled);
            }
        }
    }

    private static boolean isClassCanceled(Scanner sc){
        String[] nrOfStudentsAndAcceptedTime = sc.nextLine().split(" ");
        int nrOfStudents = Integer.parseInt(nrOfStudentsAndAcceptedTime[0]); // N
        int nrWanted = Integer.parseInt(nrOfStudentsAndAcceptedTime[1]); // K

        if((1 <= nrOfStudents && nrOfStudents <= 1000) && (1 <= nrWanted && nrWanted <= nrOfStudents)){
            String[] theTimes = sc.nextLine().split(" ");
            return nrOfStudentsOnTime(theTimes) >= nrWanted;
        }

        return true;
    }

    private static int nrOfStudentsOnTime(String[] theTimes){
        int nrOfStudentsOnTime = 0;
        for(int j = 0; j < theTimes.length; j++){
            int time = Integer.parseInt(theTimes[j]);
            if(-100 <= time && time < 100) {
                if (time <= 0) {
                    nrOfStudentsOnTime++;
                }
            }
        }
        return nrOfStudentsOnTime;
    }

}
