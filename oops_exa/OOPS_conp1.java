package oops_exa;
import java.util.Arrays;
import java.util.Scanner;


class strdfg{
    String str = "examp";
    int anda = 10;
    static int count = 0;
    static int strdf = 0;
    static int strfpara = 0;
    static int stra = 0;

     strdfg(){
         
        System.out.println(this .str);
        System.out.println(this.anda);
        strdf++;
    }
    strdfg(String a , int b){
        System.out.println(str+ "  bedore change "+ anda);
         str = a;
         anda = b;
         strfpara++;
        System.out.println(this.anda+ "  strdfg( Para )  using this  "+ this.str);
        System.out.println(str+"  strdfg( Para )  "+ anda);
    }
   void  stra(String a , int b){
        this.str = a;
        this.anda = b;
         stra++;
       System.out.println(this.anda+ "  stra( )  using this  "+ this.str);
       System.out.println(str+"  stra( ) normal  "+ anda);
    }
    void disp(){
        System.out.println(str+" "+anda);

        System.out.printf("%s  %d ",this.str,this.anda);
        System.out.println();
        count++;
        System.out.println(": count:  "+count+"   // stra: "+ stra+"  // strdf  "+strdf+ "   //strfpara: "+strfpara);
    }
    public static void main(String[] args) {
        System.out.println("ptiny");
        System.out.println(" below is for :::   strdfg s = new strdfg();  ::::    ");
        strdfg s = new strdfg();
        System.out.println(" below is for :::  s.disp(); :::::");
        s.disp();
        System.out.println(" below is for :::  strdfg s2 = new strdfg(\"hefgh\",800);  :::::");
        strdfg s2 = new strdfg("hefgh",800);
        System.out.println(" below is for :::  s2.disp(); :::::");
        s2.disp();
        System.out.println(" below is for :::  s.stra(hlo,5000) :::::");
        s.stra("hlo",5000);
        System.out.println(" below is for :::  s.disp(); :::::");
        s.disp();
        System.out.println(" below is for :::  s2.disp(); :::::");
        s2.disp();
        System.out.println(" below is for :::  strdfg s3 = new strdfg(); :::::");
        strdfg s3 = new strdfg();
        System.out.println(" below is for ::: s3.disp();  :::::");
        s3.disp();


    }
}
public class OOPS_conp1 {
    static class Student{
        int rno;
        String name ;
        float marks;
        String Subject[] = new String[10];
        // below is oops_exa.Package_exa.a constructor;
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
        //  below is oops_exa.Package_exa.a constructor that takes oops_exa.Package_exa.a object as input for passing
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
        // here by using object we have changed values (swaped) of oops_exa.Package_exa.a and b objects  , which is done internally using oops_exa.Package_exa.a function and the result is reflected outside the function

        // below is oops_exa.Package_exa.a swap wxample using primitive types
        int c  = 10;
        int d = 20;
        System.out.println(c + "  "+ d);
        swaps(c,d);  // here values are passed to the function but change made internally is not reflected outside the function
        System.out.println(c + "  "+ d);
        strdfg acd = new strdfg();
        acd.str = "hello";
        acd.anda = 10;
        acd.disp(); // when defining oops_exa.Package_exa.a class within oops_exa.Package_exa.a class , we use static
        // we cant use oops_exa.Package_exa.a non static method inside oops_exa.Package_exa.a static method
        // obj and ref concept is used

//        s2.Student(s1);
    }
}
