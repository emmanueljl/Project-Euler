import java.io.File;
import java.util.Scanner;

class P11 {

    public static void main(String[] args) {
        final int[][] grid = new int[20][20];
        try {
            Scanner scanner = new Scanner(new File("grid"));
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    grid[i][j] = scanner.nextInt();
                }
            }

            // for (int i = 0; i < 20; i++) {
            //     for (int j = 0; j < 20; j++) {
            //         System.out.print(grid[i][j] + " ");
            //     }
            //     System.out.println();
            // }
        } catch (Exception e) {
            System.out.println("File 'grid' not found!");
        }

        int maxProduct = 0;
        int tempMax;
        tempMax = maxHorizontalProduct(grid);
        if (tempMax > maxProduct) {
            maxProduct = tempMax;
        }
        tempMax = maxVerticalProduct(grid);
        if (tempMax > maxProduct) {
            maxProduct = tempMax;
        }
        tempMax = maxDiagonalProduct(grid);
        if (tempMax > maxProduct) {
            maxProduct = tempMax;
        }
        System.out.println(maxProduct);
    }

    static int maxHorizontalProduct(final int[][] grid) {
        int maxProduct = 0;

        for (int i = 0; i < 20; i++) {
            int left = 0, right = 3;
            while (right < 20) {
                int product = 1;
                for (int x = left; x <= right; x++) {
                    product *= grid[i][x];
                }
                if (product > maxProduct) {
                    maxProduct = product;
                }
                left++;
                right++;
            }
        }

        return maxProduct;
    }

    static int maxVerticalProduct(final int[][] grid) {
        int maxProduct = 0;

        for (int j = 0; j < 20; j++) {
            int top = 0, bottom = 3;
            while (bottom < 20) {
                int product = 1;
                for (int x = top; x <= bottom; x++) {
                    product *= grid[x][j];
                }
                if (product > maxProduct) {
                    maxProduct = product;
                }
                top++;
                bottom++;
            }
        }

        return maxProduct;
    }

    static int maxDiagonalProduct(final int[][] grid) {
        int maxProduct = 0;

        // Down-right diagonals
        for (int i = 0; i < 20 - 4; i++) {
            for (int j = 0; j < 20 - 4; j++) {
                int product = 1;
                int x = i, y = j;
                while (x < i + 4 && y < j + 4) {
                    product *= grid[x++][y++];
                }
                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
        }

        // Up-right diagonals
        for (int i = 0; i < 20 - 4; i++) {
            for (int j = 20 - 1; j >= 0 + 4; j--) {
                int product = 1;
                int x = i, y = j;
                while (x < i + 4 && y > j - 4) {
                    product *= grid[x++][y--];
                }
                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
        }

        return maxProduct;
    }

}