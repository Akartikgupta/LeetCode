public class Pow_x_n {

    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n <0) {
            x = 1 / x;
            n = -n;
        }

        double result = myPow(x, n - 1);
        return result * x;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.00000, -2));
    }
}
