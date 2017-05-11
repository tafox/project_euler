public class Problem4 {
    public static void main(String[] args) {
        int palindrome = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int cand = i * j;
                if (cand > palindrome && isPalindrome(cand)) {
                    palindrome = cand;
                }
            }
        }
        System.out.println("The largest palindromic product of two 3-digit numbers is: " + Integer.toString(palindrome));
    }

    private static boolean isPalindrome(int cand) {
        String str = Integer.toString(cand);
        int len = str.length();
        int mid = len/2;
        if (len % 2 == 0) {
            return isPalindromeHelper(str.substring(0, mid), str.substring(mid));
        } else {
            System.out.println(cand);
            System.out.println(str.substring(0, mid) + " " + str.substring(mid+1));
            return isPalindromeHelper(str.substring(0, mid), str.substring(mid+1));
        }
    }

    private static boolean isPalindromeHelper(String a, String b) {
        String parts[] = {a, b};
        if (parts[0].equals(reverse(parts[1]))) {
            return true;
        } 
        return false;
    }

    private static String reverse(String a) {
        int len = a.length();
        String b = "";
        for (int i = len-1; i >= 0; i--) {
            b += a.charAt(i);    
        }
        return b;
    }
} 
