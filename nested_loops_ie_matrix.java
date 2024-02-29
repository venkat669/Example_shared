import java.util.Scanner;
// using just for loops ,, print chess board layout;
public class nested_loops_ie_matrix {
    public static void main(String[] args) {
        // to print chess board
        System.out.println("enter row");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println("enter the first char ");
        char a = sc.next().charAt(0);
        if (a == 'W' || a == 'w') {
            for (int i = 0; i < b; i++) {
                for (int j = 0; j < b; j++) {
                    if ((i + j) % 2 == 0)
                        System.out.print("w");
                    else {
                        System.out.print("b");
                    }
                }
                System.out.println("");
            }
        }
        ///  array is not used
        else {

            for (int i = 0; i < b; i++) {
                for (int j = 0; j < b; j++) {
                    if ((i + j) % 2 == 0)
                        System.out.print("b ");
                    else {
                        System.out.print("w ");
                    }
                }
                System.out.println("\n");

            }
        }
    }
}
