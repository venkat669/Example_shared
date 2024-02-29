import java.util.Scanner;

public class while_exa {
    // thsi is example of ehile loop
    public static void main(String[] args) {
        String name;
        System.out.println(" enter your name");
        Scanner sc = new Scanner(System.in);
        name=sc.nextLine();
       while (name.isBlank()){
           name=sc.nextLine();
       }//   this while loop continues till  name is kept empty ( until name is given a string value);
        System.out.println("hlo " +name);
    }
}
