import java.util.*;

public class Main {

    // 1
    static long sumSquares(long n) {
        if (n <= 0) return 0L;
        return n * n + sumSquares(n - 1);
    }

    // 2
    static long sumArrayRec(long[] a, int n) {
        if (n <= 0) return 0;
        return a[n - 1] + sumArrayRec(a, n - 1);
    }

    // 3
    static long sumFirstN(int n) {
        if (n <= 0) return 0;
        return n + sumFirstN(n - 1);
    }

    // 4
    static long powRec(long b, int e) {
        if (e == 0) return 1;
        return b * powRec(b, e - 1);
    }

    static long sumPowers(long b, int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        return powRec(b, n) + sumPowers(b, n - 1);
    }

    // 5
    static void readAndPrintReverseInt(Scanner in, int n) {
        if (n == 0) return;
        int x = in.nextInt();
        readAndPrintReverseInt(in, n - 1);
        System.out.print(x + (n == 1 ? "\n" : " "));
    }

    // 6
    static void readAndPrintReverseStrings(Scanner in, int n) {
        if (n == 0) return;
        String s = in.next();
        readAndPrintReverseStrings(in, n - 1);
        System.out.println(s);
    }

    // 7
    static void fillSpiral(int[][] a, int top, int left, int bottom, int right, int[] cur) {
        if (top > bottom || left > right) return;

        for (int j = left; j <= right; ++j) a[top][j] = cur[0]++;
        for (int i = top + 1; i <= bottom; ++i) a[i][right] = cur[0]++;
        if (top < bottom) {
            for (int j = right - 1; j >= left; --j) a[bottom][j] = cur[0]++;
        }
        if (left < right) {
            for (int i = bottom - 1; i > top; --i) a[i][left] = cur[0]++;
        }
        fillSpiral(a, top + 1, left + 1, bottom - 1, right - 1, cur);
    }

    static void printSpiralSquare(int n) {
        int[][] a = new int[n][n];
        int[] cur = new int[]{1};
        fillSpiral(a, 0, 0, n - 1, n - 1, cur);
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(a[i][j]);
                System.out.print(j + 1 == n ? "\n" : " ");
            }
        }
    }

    // 8
    static void genSequences(int n, int k, int[] cur, int pos) {
        if (pos == n) {
            for (int i = 0; i < n; ++i) {
                System.out.print(cur[i]);
                System.out.print(i + 1 == n ? "\n" : " ");
            }
            return;
        }
        for (int v = 1; v <= k; ++v) {
            cur[pos] = v;
            genSequences(n, k, cur, pos + 1);
        }
    }

    // 9
    static void permute(char[] s, int l) {
        int n = s.length;
        if (l == n) {
            System.out.println(new String(s));
            return;
        }
        for (int i = l; i < n; ++i) {
            char tmp = s[l]; s[l] = s[i]; s[i] = tmp;
            permute(s, l + 1);
            tmp = s[l]; s[l] = s[i]; s[i] = tmp;
        }
    }

    // 10
    static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        if (n % 2 != 0) return false;
        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Choose task: (1-10)");
            System.out.println("0 - EXIT");
            System.out.print("Your choice: ");

            if (!in.hasNextInt()) return;
            int choice = in.nextInt();
            if (choice == 0) break;

            if (choice == 1) {
                int n = in.nextInt();
                System.out.println("Result: " + sumSquares(n));
            } else if (choice == 2) {
                int n = in.nextInt();
                long[] a = new long[n];
                for (int i = 0; i < n; ++i) a[i] = in.nextLong();
                System.out.println("Result: " + sumArrayRec(a, n));
            } else if (choice == 3) {
                int n = in.nextInt();
                System.out.println("Result: " + sumFirstN(n));
            } else if (choice == 4) {
                long b = in.nextLong();
                int n = in.nextInt();
                System.out.println("Result: " + sumPowers(b, n));
            } else if (choice == 5) {
                int n = in.nextInt();
                readAndPrintReverseInt(in, n);
            } else if (choice == 6) {
                int n = in.nextInt();
                readAndPrintReverseStrings(in, n);
            } else if (choice == 7) {
                int n = in.nextInt();
                printSpiralSquare(n);
            } else if (choice == 8) {
                int n = in.nextInt();
                int k = in.nextInt();
                int[] cur = new int[n];
                genSequences(n, k, cur, 0);
            } else if (choice == 9) {
                String s = in.next();
                permute(s.toCharArray(), 0);
            } else if (choice == 10) {
                int n = in.nextInt();
                System.out.println(isPowerOfTwo(n) ? "true" : "false");
            } else {
                System.out.println("Invalid choice");
            }

            System.out.println();
        }

        in.close();
    }
}
