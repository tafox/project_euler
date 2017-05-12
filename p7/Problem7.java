import java.lang.Math;

public class Problem7 {
    
    public static void main(String[] args) {
        int numberOfPrimes = 0;
        for (int i = 2;; i++) {
            if (isPrime(i)) {
                numberOfPrimes++;
                if (numberOfPrimes == 10001) {
                    System.out.println("The 10,001st prime is: " + Integer.toString(i));
                    return;
                }
            }
        }
    }

    private static boolean isPrime(int candidate) {
        int limit = (int) Math.round(Math.sqrt(candidate));
        for (int i = 2; i <= limit; i++) {
            if (candidate % i == 0) {
                return false;
            }

        } 
        return true;
    }

    public enum Type { NOT_TESTED, NOT_PRIME, PRIME };

    private class Pair {
        private int a;
        private Type b;

        public int number() {
            return a;
        }

        public Type type() {
            return b;
        }

        public void number(int in) {
            a = in;
        }

        public void type(Type in) {
            b = in;
        }
    }

}
