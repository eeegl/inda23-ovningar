class Factorial {
    
    public static int factRec(int n) {
        return n == 0 ? 1 : n * factRec(n - 1);
    }

    public static int factIt(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 10;

        // factRec(-1);
        System.out.println(factIt(-1));

        for (int i = 0; i <= n; i++) {
            System.out.println("factIt(" + i + ") = " + factIt(i));
        }

        for (int i = 0; i <= n; i++) {
            System.out.println("factRec(" + i + ") = " + factRec(i));
        }
    }
}