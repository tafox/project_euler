public class Problem10 {
    
    static int N = 2000000;
    //static int N = 1000;

    public enum Type { PRIME, NOT_PRIME, NOT_PROCESSED }
    
    public static void main(String[] args) {
        Pair[] numbers = new Pair[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = new Pair(i, Type.NOT_PROCESSED);
        }
        long sum = sumOfPrimesN(numbers); 
        System.out.println("Sum of all primes under 2,000,000: " + Long.toString(sum));
    }

    // Sieve of Eratosthenes
    private static long sumOfPrimesN(Pair[] numbers) {
        long sumOfPrimes = 2;    
        int p = 2;
        numbers[p].setType(Type.PRIME);
        while (true) {
            int i = 2*p;
            while (i < N) {
                numbers[i].setType(Type.NOT_PRIME);     
                i += p;
            }
            for (i = p+1; i < N && numbers[i].getType() != Type.NOT_PROCESSED; i++) {
                ;    
            }
            if (i == N) {
                break;
            }
            numbers[i].setType(Type.PRIME);
            p = i;
            sumOfPrimes += p;
        }
        return sumOfPrimes;
    }

}


