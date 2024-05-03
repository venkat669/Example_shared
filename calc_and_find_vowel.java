import java.util.Scanner;

public class calc_and_find_vowel {
    // Switch statement example
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter your option ");
        System.out.println("+ = /  -  %  ");
        char  x = sc.next().charAt(0);
        System.out.println(" enter two numbers ");
        int a = sc.nextInt();
        int b =sc.nextInt();
        switch(x){
            case  '+' :
                int c = a+b;
                System.out.println(c);
                break;
            case  '-' :
                 c = a-b;
                System.out.println(c);
                break;
            case  '%' :
                 c = a%b;
                System.out.println(c);
                break;
            case  '/' :
                 c = a/b;
                System.out.println(c);
                break;
            case  '*' :
                 c = a*b;
                System.out.println(c);
          break;
            default:
                System.out.println("Enter right option");
       break;
        }

        // to find vowel;
        System.out.println("give oops_exa.Package_exa.a letter");
        char h = sc.next().charAt(0);
        switch(h){

            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'U':
            case 'u':
                System.out.println("its vowel");
                break;
            default:
                System.out.println("not vowel");
        }
    }
}
