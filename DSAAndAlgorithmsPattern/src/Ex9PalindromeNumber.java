public class Ex9PalindromeNumber {

    public static boolean isPalindrome(int x) {

        String[] strX = (x + "").split("");
        StringBuilder result = new StringBuilder();
        for (int i = strX.length-1; i >= 0; i--){
            result.append(strX[i]);
        }
        return result.toString().equals(x+"");
    }

    public boolean isPalindromeV2(int x) {

        int rev = 0;
        int temp = x;

        if(x<0) return false;

        while( x != 0){
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }
        return rev == temp;
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}
