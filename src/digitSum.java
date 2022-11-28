public class digitSum {
    public static void main(String[] args){
        System.out.println(digitSum(0));
    }
    public static int digitSum(int number){
        int sum = 0;
        for(int i = number ; i != 0 ; i = i / 10){
            sum = sum + (i % 10);
        }
        return sum;
    }
}
