public class Problem5 {
    public static void main(String[] args) {
        for (int i = 21;; i++) {
            int j = 0;
            for (j = 2; j <= 20; j++) {
                if (i % j != 0) {
                    j = 0;
                    break;
                }    
            }
            if (j == 21) {
                System.out.println("Smallest positive number that is evenly divisible by the numbers 1-20: " + Integer.toString(i));
                return;
            }
        }
    }
}
