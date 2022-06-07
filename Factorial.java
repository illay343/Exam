import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {
        BigInteger result = BigInteger.valueOf(1); //  creating a large variable
        int sum = 0;
        for (int i = 1; i < 100; i++) {//
            result = result.multiply(BigInteger.valueOf(i));// cycle which multiplies factorial
            System.out.println(result);
        }
        String line = result.toString();//convert to string

        for (int j = 0; j < 156; j ++) {//cycle which sums all number of result
            char simbol = line.charAt(j);//
            sum += Character.getNumericValue(simbol);//
        }
        System.out.println(sum);
    }

}