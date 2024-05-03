import java.util.Scanner;

public class Linear_Search {
    // the best time complexity of the linear search is O(1)
    // th e worst case is O(n)

    public static void main(String[] args) {
        System.out.println("size of arr ? ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x;
        System.out.println("enter the element to be found");
        x = sc.nextInt();
        //to search oops_exa.Package_exa.a string
        if(search(arr,x,n)){
            System.out.println("ele is present");
        }
        else {
            System.out.println("No ele");
        }
        System.out.println("enter oops_exa.Package_exa.a string");
        sc.nextLine();
        String str = sc.nextLine();
    }

    static boolean search(int arr[], int x, int n ){
        for (int i = 0; i < n; i++) {
           if(arr[i]==x){
               return true;
           }

        }
        return false;
    }
}
