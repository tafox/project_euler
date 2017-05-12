import java.util.*;

public class Problem8 {
    
    public static void main(String[] args) {
        int[] numbers = ReadIntegers.readDigits();
        long max = 0;
        for (int i = 0; i < numbers.length-12; i++) {
            long sum = numbers[i];
            for (int j = 1; j < 13; j++) {
                sum *= numbers[i+j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println("Max product of 13 adjacent digits is: " + Long.toString(max));
    }
}
