public class milesPerHour {

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));
        printConversion(-2.0);
        printMegaBytesAndKiloBytes(2500);
        System.out.println(shouldWakeUp(false, -2));
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
//        int temp = (int) -3.9;
//        System.out.println(temp);
        System.out.println(hasTeen(13));

        System.out.println(getHeight(5,8));

        int tempAge = 25;
        switch (tempAge){
            case 20:
                System.out.println("He is 20");
                break;
            case 25 : case 26:
                System.out.println("He is 25 , or 26");
                break;
            default:
                System.out.println("Neither 20 or 25 or 26");
                break;
        }

        switch (tempAge) {
            case 20 -> System.out.println("He is 20");
            case 25, 26 -> System.out.println("He is 25 , or 26");
            default -> System.out.println("Neither 20 or 25 or 26");
        }
        switch(20){
            case 0: {System.out.println("ZERO"); break;}
            case 1: {System.out.println("ONE"); break;}
            case 2: {System.out.println("TWO"); break; }
            case 3: {System.out.println("THREE"); break; }
            case 4: {System.out.println("FOUR"); break; }
            case 5: {System.out.println("FIVE"); break; }
            case 6: {System.out.println("SIX"); break; }
            case 7: {System.out.println("SEVEN"); break; }
            case 8: {System.out.println("EIGHT"); break; }
            case 9: {System.out.println("NINE"); break; }
            default: {System.out.println("OTHER"); break;}
        }
    }


    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1L;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + "mi/h");
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(kiloBytes + " KB = " + (kiloBytes / 1024) + " MB and " + (kiloBytes % 1024) + " KB");
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking != true) {
            return false;
        } else if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if ((hourOfDay > 22 || hourOfDay < 8)) {
            return true;
        }
        return false;
    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {

        if (first < 0 && second > 0 || first > 0 && second < 0) {
            return false;
        }

        double firstThousand = first * 1000;
        double secondThousand = second * 1000;
        System.out.println(firstThousand + " ! " + secondThousand);
        int firstint = (int) firstThousand;
        int secondint = (int) secondThousand;
        System.out.println(firstint + " ! " + secondint);

        if (firstint == secondint) {
            return true;
        }

        return false;

    }

    public static boolean hasTeen(int teen) {
        if (teen >= 13 && teen <= 19) {
            return true;
        }
        return false;
    }

    public static double getHeight(int heightInch) {
        return (heightInch * 2.54);
    }

    public static double getHeight(int heightFeet, int remainingHeightInch) {
        if (heightFeet == 5 && remainingHeightInch == 8) {
            // convert the feet to inches
            int feetToInchdes = heightFeet * 12;
            return getHeight(feetToInchdes + remainingHeightInch);
        }

        return  0.0;
    }

    public static double area(double radius){
        if(radius < 0)
            return -1.0;

        return (radius * radius * Math.PI);
    }
    public static double area(double x , double y){
        if(x < 0 || y < 0)
            return -1.0;

        return (x*y);
    }


}
