import java.util.Arrays;
import java.util.Scanner;

public class OOPS_conp1 {
    static class Student{
        int rno;
        String name ;
        float marks;
        String Subject[] = new String[10];
        // below is a constructor;
        void Student(){
            this.name = "sample name";
            this.marks = 00;
            this.rno = 100;
            Arrays.fill(this.Subject,"nUll");
            int i =0;
            i=i+1;
            System.out.println(i);
        }
        // below constructor is for 3 arguments
        void Student(String name , int rno , float marks ){
            this.name = name;
            this.rno = rno;
            this.marks = marks;
            System.out.println("enter the no of subjects");
            Scanner sc = new Scanner(System.in);

            int no = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < no; i++) {
                this.Subject[i]=sc.nextLine();
            }
        }
        // below constructor displays object;
        void Display(){
            System.out.println(this.marks+" "+this.rno+" "+this.name +"  "+ Arrays.toString(this.Subject));
        }
    }
    public static void main(String[] args) {

       Student s1 = new Student();
       s1.Student("kumar",1,80);
        s1.Display();
    }
}
