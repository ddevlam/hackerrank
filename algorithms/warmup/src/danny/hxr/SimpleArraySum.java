package danny.hxr;

import java.io.IOException;
import java.util.Scanner;

public class SimpleArraySum {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int nrOfInts = sc.nextInt();

        if(1 <= nrOfInts && nrOfInts <= 1000) {
            while(sc.hasNextInt()){
                int next = sc.nextInt();
                if(0 <= next && next <= 1000){
                    sum += next;
                }

            }

        }

        System.out.println(sum);
    }
}
