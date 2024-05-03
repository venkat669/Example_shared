package oops_exa;

public class exa1 {
    ///  for understanding of static keyword view static example
    // this is proper example of annonymous function

    /*
    Constructor name must be the same as its class name
    A Constructor must have no explicit return type
    A Java constructor cannot be abstract, static, final, and synchronized
     */
    static Integer cnt = 0;
    int student_rno = 0;//   Instanc variable
    String student_Name = " default name";// Instanc variable  ( Instance variable is the variable declared inside oops_exa.Package_exa.a class, but outside oops_exa.Package_exa.a method:)
    static String static_Name = "sdf";

    exa1() {
        System.out.println("default constructor is called ");
        cnt++;
        System.out.println("value of  count : " + cnt);
    }

    exa1(String student_Name, int student_rno) {
        this.student_Name = student_Name;
        this.student_rno = student_rno;
    }

    void disp() {
        System.out.println("exa1.disp   this:   " + this.getClass());
        System.out.println(student_Name + "   " + student_rno);
        System.out.println(this.student_Name + "  \"using this \" " + this.student_rno);
        System.out.println("Static name   " + static_Name);
    }

    void chg_exa1_stat(exa1 other) {
        System.out.println("name of obj : " + other.student_Name);
        System.out.println("static name befor change     " + static_Name);
        static_Name = other.student_Name;
        System.out.println("static name is changerd to name of " + this.student_Name + " student name  " + static_Name);
    }

    void add(Integer a, Integer b) {
        new exa1();

        // "Integer is oops_exa.Package_exa.a warapper class , by using oops_exa.Package_exa.a wrapper class we can access new functionality in which we cant use if the variable is primitive
        // by using "Integer we declare "oops_exa.Package_exa.a" as an object and it is stored in heap memory
        int op = (a.byteValue() + b.byteValue());
        System.out.println(op);
    }

}
