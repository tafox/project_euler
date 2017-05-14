import java.lang.Math;

public class Problem9 {
    
    public static void main(String[] args) {
        int[] triplet = findPythagoreanTriplet1000();
        System.out.println("a: " + Integer.toString(triplet[0]) + "b: " + Integer.toString(triplet[1]) + "c: " + Integer.toString(triplet[2]));
        System.out.println("abc: " + Integer.toString(triplet[0] * triplet[1] * triplet[2]));
    }

    private static int[] findPythagoreanTriplet1000() {
        int[] triplet = { 3, 4, 5};
        for (int a = 4; a < 998; a++) {
            for (int b = 5; b < 998; b++) {
                int c2 = a*a + b*b;
                int c = (int) Math.sqrt(c2);
                if (Math.pow(c,2) == c2) {
                    if (a + b + c == 1000) {
                        triplet[0] = a;
                        triplet[1] = b;
                        triplet[2] = c;
                        return triplet;
                    }
                }
            }
        }
        return triplet;
    }
}

