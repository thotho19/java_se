package isc.practicing;

public class Main {

    public static void main(String[] args) {
        int minimumIntValue = Integer.MIN_VALUE;
        int maximumIntValue = Integer.MAX_VALUE;
        System.out.println("minimumIntValue :" + minimumIntValue);
        System.out.println("maximumIntValue :" + maximumIntValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("minShortValue :" + minShortValue);
        System.out.println("maxShortValue :" + maxShortValue);

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("minimumLongValue :" + minLongValue);
        System.out.println("maximumLongValue :" + maxLongValue);


        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("minimumByteValue :" + minByteValue);
        System.out.println("maximumByteValue :" + maxByteValue);
        long longTest = 2_147_483_648L;
        System.out.println(longTest);

        int dividedNumber = (maximumIntValue / 2);
        System.out.println(dividedNumber);

        byte dividedByteNumber = (byte)(2147483647 / 2);
        System.out.println(dividedByteNumber);
        System.out.println(-1L);
    }
}
