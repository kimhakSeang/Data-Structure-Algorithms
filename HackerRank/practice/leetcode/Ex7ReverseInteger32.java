package practice.leetcode;

public class Ex7ReverseInteger32 {
    public static int reverse(int x) {

        String[] xStr = (x+"").split("");
        long result = 0;
//        int op = x < 0 ? -1 : 1;

        for(int i = xStr.length-1; i >= 0; i --){
            if (xStr[i].equals("-")){
                continue;
            }
            result += Integer.parseInt(xStr[i]) ;
            if(i == xStr.length-1){
                if (x < 0) {
                    result *= -1;
                }
            }
            if(result>Integer.MAX_VALUE || result<Integer.MIN_VALUE){
                return 0;
            }

            result *= 10;
        }
        return ((int)result/10);
    }
//2,147,483,647
//9,646,324,350
//1,056,389,758
    public static void main(String[] args) {
        int i = -2147483412;
        System.out.println(reverse(i ));
    }
}
