package Patterns;

public class Triangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n*2-1; i++) {
                if (i<=n) {
                    for (int j = 1; j <= n * 2 - 1; j++) {
                        if ((i + j) == n + 1 && j <= (n * 2 / 2) || (j - i) == n - 1 && j > n) {
                            System.out.print(i + "\t");
                        } else {
                            System.out.print("\t");
                        }
                    }
                    System.out.println();
                }
                    else{

                        for (int j = 1; j <= n * 2 - 1; j++) {
                            if ((i - j) == n - 1 && j <= n ||(i + j) == (n*2) + n-1 && j >= n) {
                            int num = n*2-i;
                                System.out.print(num + "\t");
                            } else {
                                System.out.print("\t");
                            }
                        }
            System.out.println();
                    }

        }
    }
}
