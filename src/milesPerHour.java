public class milesPerHour {

    public static void main(String[] args){
        System.out.println(toMilesPerHour(1.5));
        printConversion(-2.0);
        printMegaBytesAndKiloBytes(2500);
        System.out.println(shouldWakeUp(false , -2));
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
//        int temp = (int) -3.9;
//        System.out.println(temp);
        System.out.println(hasTeen(13));
    }


    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1L;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
            return ;
        }
        System.out.println( kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) +  "mi/h");
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0 ){
            System.out.println("Invalid Value");
            return ;
        }
        System.out.println(kiloBytes + " KB = "+ (kiloBytes/1024) +" MB and "+ (kiloBytes % 1024) +" KB");
    }
    public static boolean shouldWakeUp(boolean barking  , int hourOfDay ) {
        if(barking != true){
            return false;
        }else if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        }else if((hourOfDay > 22 || hourOfDay < 8)){
            return true;
        }
        return false;
    }

    public static boolean areEqualByThreeDecimalPlaces(double first,double second) {

        if (first <0 && second >0 || first >0 && second <0){
            return false;
        }

        double firstThousand = first*1000;
        double secondThousand = second*1000;
        System.out.println(firstThousand + " ! " + secondThousand);
        int firstint = (int)firstThousand;
        int secondint = (int)secondThousand;
        System.out.println(firstint + " ! " + secondint);

        if (firstint==secondint){
            return true;
        }

        return false;

    }

    public static boolean hasTeen (int teen){
        if(teen >= 13 && teen <= 19){
            return true;
        }
        return false;
    }
}
