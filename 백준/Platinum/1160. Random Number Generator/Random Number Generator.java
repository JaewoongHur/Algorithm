import java.util.Scanner;

public class Main {
    static long m, a, c, x0, n, g;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        m = sc.nextLong();
        a = sc.nextLong();
        c = sc.nextLong();
        x0 = sc.nextLong();
        n = sc.nextLong();
        g = sc.nextLong();

        Matrix t = pow(n);
        System.out.println((mul(t.c, mul(a, x0) + c) + mul(t.d, x0)) % m % g);

        sc.close();
    }

    static long mul(long x, long y) {
        if (y == 0) return 0;
        return (mul(x, y / 2) * 2 + (y % 2 == 1 ? x : 0)) % m;
    }

    static class Matrix {
        long a, b, c, d;

        public Matrix(long _a, long _b, long _c, long _d) {
            a = _a;
            b = _b;
            c = _c;
            d = _d;
        }

        Matrix multiply(Matrix i) {
            return new Matrix(mul(a, i.a) + mul(b, i.c) % m, mul(a, i.b) + mul(b, i.d) % m,
                    mul(c, i.a) + mul(d, i.c) % m, mul(c, i.b) + mul(d, i.d) % m);
        }
    }

    static Matrix pow(long x) {
        if (x == 0) return new Matrix(1, 0, 0, 1);
        Matrix t = pow(x / 2);
        return t.multiply(t).multiply(x % 2 == 1 ? new Matrix(a + 1, m - a % m, 1, 0) : new Matrix(1, 0, 0, 1));
    }
}