import java.util.Scanner;

public class user_input_java{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" priny");
        String  name = scanner.nextLine();
        System.out.println("hello "+name);
        System.out.println("what is ur age");
        int age = scanner.nextInt();
        System.out.println("ur age is "+age);
    }///
}