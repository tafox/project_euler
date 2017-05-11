class Problem2 {
    public static void main(String[] args) {
        int f1 = 1;
        int f2 = 2;
        int f3 = f2 + f1;
        int sum = 2;
        while (f3 < 4000000) {
            f1 = f2;
            f2 = f3;
            f3 = f2 + f1;
            if (f3 % 2 == 0) {
                sum += f3;
            }
        } 
        System.out.println("Sum of even-valued terms of the fibonacci sequence whose value is less than 4,000,000: " + Integer.toString(sum));
    }
}
