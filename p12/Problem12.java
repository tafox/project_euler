import java.lang.Math;

public class Problem12 {
    
    public static void main(String[] args) {
        int candidate = 0;
        for (int i = 0; ; i++) {
            candidate = TriangularNumberGenerator.getNextTriangularNumber();
            int numberOfDivisors = divisors(candidate);
            if (numberOfDivisors > 500) {
                System.out.println(Integer.toString(candidate) + " is the first triangular number to have over 500 divisors");        
                break;
            }
            
        }
         
    }

    private static int divisors(int candidate) {
        int count = 0;
        int limit = (int) Math.round(Math.sqrt(candidate));
        for (int i = 1; i < limit; i++) {
            if (candidate % i == 0) {
                count += 2;
            }
        }
        if (limit * limit == candidate) {
            count++;
        }
        return count;
    }

    private static class TriangularNumberGenerator {
        static int NthTriangularNumber = 0;
        static int n = 0;

        public static int getNextTriangularNumber() {
            n++;
            NthTriangularNumber += n;
            return NthTriangularNumber;
        }
        
    }

}
