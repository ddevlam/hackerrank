package danny.hxr;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nrOfInts = sc.nextInt();
        int sumDown = 0, sumUp = 0;

        // Prepare array
        int[][] asArray = new int[nrOfInts][nrOfInts];
        if(1 <= nrOfInts && nrOfInts <= 100) {
            for(int i = 0; i < nrOfInts; i++){
                for(int j = 0; j < nrOfInts; j++ ) {
                    asArray[i][j] = sc.nextInt();
                }
            }

        }

        // Forward
        for(int i = 0, j = 0; i < nrOfInts; i++, j++){
            int next = asArray[i][j];
            if(-100 <= next && next <= 100) {
                sumDown += next;
            }
        }

        // Backward
        for(int i = nrOfInts - 1, j = 0; i >= 0; i--, j++){
            int next = asArray[j][i];
            if(-100 <= next && next <= 100) {
                sumUp += next;
            }
        }

        // Print
        System.out.println(Math.abs(sumDown - sumUp));
    }
}
