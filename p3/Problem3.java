import java.lang.*;

class Problem3 {

    public static final long GOAL = 600851475143L;

    public static void main(String[] args) {
        final long limit = (long) Math.round(Math.sqrt(GOAL));
        long factor = 1;
        for (int i = 2; i < limit; i++) {
            if (GOAL % i == 0) {
                long cand = GOAL/i;    
                if (cand > factor && isPrime(cand)) {
                    factor = cand;
                } else if (i > factor && isPrime(i)) {
                    factor = i;
                }
            }
        }
        System.out.println("Largest prime factor of " + Long.toString(GOAL) + " is: " + Long.toString(factor));
    }

    private static boolean isPrime(long cand) {
        final long limit = (long) Math.round(Math.sqrt(cand));
        for (int i = 2; i < limit; i++) {
            if (cand % i == 0) {
                return false;
            }
        }
        return true;
    }
}
