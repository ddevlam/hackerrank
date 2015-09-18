package danny.hxr;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {
    public static void main(String[] args) {
        BigInteger result = BigInteger.ZERO;

        Scanner sc = new Scanner(System.in);
        int nrOfFactorial = sc.nextInt();

        if(1 <= nrOfFactorial && nrOfFactorial <= 100){
            result = calculate(BigInteger.valueOf(nrOfFactorial), --nrOfFactorial);
        }

        System.out.println(result);
    }

    private static BigInteger calculate(BigInteger input, int nrOfFactorial){
        if(nrOfFactorial == 0){
            return input;
        }

        return input.multiply(calculate(BigInteger.valueOf(nrOfFactorial), --nrOfFactorial));
    }
}
