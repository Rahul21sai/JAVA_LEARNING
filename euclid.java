public class euclid {
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 60, b = 36;
        int g = gcd(a, b);
        System.out.println(g);
    }
}
