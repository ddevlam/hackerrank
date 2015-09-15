package danny.hxr;

import java.io.IOException;
import java.util.Scanner;

public class AVeryBigSum {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        int nrOfInts = sc.nextInt();

        if(1 <= nrOfInts && nrOfInts <= 10) {
            while(sc.hasNextInt()){
                long next = sc.nextLong();
                if(0 <= next && next <= Math.pow(10, 10)){
                    sum += next;
                }

            }

        }

        System.out.println(sum);
    }
}
