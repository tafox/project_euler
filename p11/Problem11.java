public class Problem11 {

    final static int N = 20;

    public static void main(String[] args) {
        int[][] numbers = ReadIntegers.readGrid(N);
        System.out.println("Finding largest product of 4 adjacent numbers in the following grid:");
        printGrid(numbers, N);
        int max = findLargestProduct(numbers, N);
        System.out.println("The largest product of 4 adjacent numbers in the grid is: " + Integer.toString(max));
    }

    private static int findLargestProduct(int[][] numbers, int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int[] products = new int[6];
                products[0] = checkRight(numbers, i, j, n); 
                products[1] = checkDown(numbers, i, j, n); 
                products[2] = checkLeft(numbers, i, j, n); 
                products[3] = checkUp(numbers, i, j, n); 
                products[4] = checkDiagonalRight(numbers, i, j, n); 
                products[5] = checkDiagonalLeft(numbers, i, j, n); 
                int cand = max(products); 
                if (cand > max) {
                    max = cand;
                }
            }
        }
        return max;
    } 

    private static int checkRight(int[][] numbers, int row, int col, int n) {
        int sum = numbers[row][col];
        for (int j = col+1; j < n && j < col+4; j++) {
            sum *= numbers[row][j];    
        }
        return sum;
    }

    private static int checkDown(int[][] numbers, int row, int col, int n) {
        int sum = numbers[row][col];
        for (int i = row+1; i < n && i < row+4; i++) {
            sum *= numbers[i][col];    
        }
        return sum;
    }

    private static int checkLeft(int[][] numbers, int row, int col, int n) {
        int sum = numbers[row][col];
        for (int j = col-1; j >= 0 && j > col-4; j--) {
            sum *= numbers[row][j];    
        }
        return sum;
    }

    private static int checkUp(int[][] numbers, int row, int col, int n) {
        int sum = numbers[row][col];
        for (int i = row-1; i > 0 && i > row-4; i--) {
            sum *= numbers[i][col];    
        }
        return sum;
    }

    private static int checkDiagonalRight(int[][] numbers, int row, int col, int n) {
        int sum = numbers[row][col];
        for (int i = row+1, j = col+1, k = 0; i < n && j < n && k < 3; i++, j++, k++) {
            sum *= numbers[i][j];    
        }
        return sum;
    }

    private static int checkDiagonalLeft(int[][] numbers, int row, int col, int n) {
        int sum = numbers[row][col];
        for (int i = row+1, j = col-1, k = 0; i < n && j > 0 && k < 3; i++, j--, k++) {
            sum *= numbers[i][j];    
        }
        return sum;
    }

    private static int max(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    private static void printGrid(int[][] numbers, int n) {
        for (int i = 0; i < n; i++) {
            if (i < 10) {
                System.out.print(" " + Integer.toString(i) + ": ");
            } else {
                System.out.print(Integer.toString(i) + ": ");
            }
            for (int j = 0; j < n; j++) {
                if (numbers[i][j] < 10) {
                    System.out.print(" " + Integer.toString(numbers[i][j]) + " ");
                } else {
                    System.out.print(Integer.toString(numbers[i][j]) + " ");
                }    
            }
            System.out.println();
        }     
    }
}
