public class Problem6 {
    public static void main(String[] args) {
        int sq100 = (100*101)/2;
        sq100 *= sq100;
        System.out.println("Square of the sum of the first 100 natural numbers: " + Integer.toString(sq100));

        int sum100sq = 0;
        for (int i = 1; i <= 100; i++) {
            sum100sq += i*i;
        }
        System.out.println("Sum of the squares of the first 100 natural numbers: " + Integer.toString(sum100sq));
        System.out.println("Difference between the two numbers: " + Integer.toString(sq100 - sum100sq));
    }
}
