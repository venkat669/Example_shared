import java.util.Scanner;
// example for expressions;
public class Rev {
    public static void main(String[] args){
        int a;
        int ans=0;
        int rem =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
         a =  sc.nextInt();
        System.out.println("given number "+a);
        sc.nextLine();
        while(a>0){
            rem = a%10;
            ans = ans*10 +rem;
            a/=10;
        }
        System.out.println("reverse is "+ans);
    }
}