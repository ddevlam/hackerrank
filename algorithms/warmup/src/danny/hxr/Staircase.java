package danny.hxr;

import java.io.IOException;
import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int nrOfInts = sc.nextInt();

        if(1 <= nrOfInts && nrOfInts <= 100) {
            for (int i = 0; i < nrOfInts; i++) {
                int nrOfSpaces = nrOfInts - (i + 1);
                int nrOfHashes = nrOfInts - nrOfSpaces;

                for (int j = 0; j < nrOfSpaces; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < nrOfHashes; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
        }
    }
}
