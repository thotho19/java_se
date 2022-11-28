public class palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int number) {
        if (number < 0)
        {
            number *= -1;
        }

        int reverse = 0;
        int temp = number;
        int sum = 0;
        int reminder = 0;
        while(number > 0){
            reminder = number % 10;
            sum = (sum * 10) + reminder;
            number = number / 10;
        }
        return temp == sum ? true : false;
    }
}
