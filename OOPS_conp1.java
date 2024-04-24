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
        void  changename(){
            this.name="name is changed 1";
        }
        void changename(Student other_obj){
            other_obj.name="other name is changed";
        }
        //
        static void swap(Student a , Student b){
            Student temp = new Student();
            temp.rno = a.rno;
            a.rno =  b.rno;
            b.rno=temp.rno;
        }
        //  below is a constructor that takes a object as input for passing
        void Student(Student sample_Object_name){
          this.name = sample_Object_name.name;
          this.marks = sample_Object_name.marks;
          this.rno = sample_Object_name.rno + 1;
          this.Subject = sample_Object_name.Subject;

        }
    }
    static void swaps( int e  , int  f){
        int tmp ;
        tmp = f;
        f = e;
        e = tmp;
    }

    public static void main(String[] args) {

        Student s1 = new Student();  // new object "s1" is created
       s1.Student("kumar",1,80); // invokes student constructor with 3 argument
        s1.Display();
        Student s2 = new Student();  // new object "s2" is created
        s2.Student(s1); // invokes constructor that takes an Object as input
        s2.Display();
        System.out.println(s1.name); // s1.name is kumar here
        s1.name="change name ";
        s1.changename();
        System.out.println(s1.name);
        s1.changename(s1);
        System.out.println(s1.name);
        Student a = new Student();
        Student b = new Student();
        a.rno = 10;
        b.rno =20;
        System.out.println(a.rno + "  "+ b.rno);
        s1.swap(a,b);
        System.out.println(a.rno + "  "+ b.rno);
        // here by using object we have changed values (swaped) of a and b objects  , which is done internally using a function and the result is reflected outside the function

        // below is a swap wxample using primitive types
        int c  = 10;
        int d = 20;
        System.out.println(c + "  "+ d);
        swaps(c,d);  // here values are passed to the function but change made internally is not reflected outside the function
        System.out.println(c + "  "+ d);
//        s2.Student(s1);
    }
}
