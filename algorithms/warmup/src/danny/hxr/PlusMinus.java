package danny.hxr;

import java.io.IOException;
import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int nrOfInts = sc.nextInt();
        double nrOfNegatives = 0, nrOfPositive = 0, nrOfZeros = 0;

        if(1 <= nrOfInts && nrOfInts <= 100) {
            while(sc.hasNextInt()){
                long next = sc.nextLong();
                if(-100 <= next && next <= 100){
                    if(0 == next){
                        nrOfZeros++;
                    } else if (next > 0){
                        nrOfPositive++;
                    } else {
                        nrOfNegatives++;
                    }
                }

            }

        }

        System.out.println(nrOfPositive == 0 ? 0 : nrOfPositive / nrOfInts);
        System.out.println(nrOfNegatives == 0 ? 0 : nrOfNegatives / nrOfInts);
        System.out.println(nrOfZeros == 0 ? 0 : Double.valueOf(nrOfZeros / nrOfInts));
    }
}
