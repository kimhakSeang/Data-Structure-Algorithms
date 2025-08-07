package practice;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OneMultiplyNumber {

    public static void fizzBuzz(int n) {
        if ( n < 0 || n > 200000){
            throw new RuntimeException();
        }
        IntStream.rangeClosed(1, n)
                .boxed()
                .map(num -> {
                   if (num % 3 == 0 && num % 5  == 0) return "fizzBuzz";
                   else if (num % 3 == 0) return "Fizz";
                   else if (num % 5 == 0) return "Buzz";
                   else return num;
                })
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        fizzBuzz(15);
    }
}
