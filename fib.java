public class fib {
    public static void main(String[] args) {
        int n = 8;

        int ans = fibo(n);
        System.out.println(ans);
    }



    private static int fibo(int n) {
        if (n<=1){
            return  1;
        }

        return fibo(n-1)+fibo(n-2);
    }
}
