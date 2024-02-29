import java.util.Scanner;

//usange of Math class
public class hypotenuse_Math {
public static void main(String[] args){
    System.out.println("enter the 1st side");
    Scanner sc = new Scanner(System.in);
    int a =  sc.nextInt();
    System.out.println("enter the 2nd side");
    int b =  sc.nextInt();
    double c = Math.sqrt((a*a)+(b*b));  // Hypo ==   c^2= a^2 + b^2
    System.out.println("the 3rd side "+Math.round(c));
}
}
