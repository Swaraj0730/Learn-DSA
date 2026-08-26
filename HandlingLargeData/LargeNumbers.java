package HandlingLargeData;

import java.math.BigInteger;

public class LargeNumbers {

    public static void main(String[] args){

        int a = 30;
        int b = 67;

        BigInteger A =  BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(878909907);
        BigInteger C = new BigInteger("2323244");
        BigInteger s = A.add(B);


        System.out.println(s);

    }
}
