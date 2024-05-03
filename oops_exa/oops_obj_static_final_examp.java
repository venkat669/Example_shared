package oops_exa;
class exa1{
    ///  for understanding of static keyword view static example
    // this is proper example of annonymous function

    /*
    Constructor name must be the same as its class name
    A Constructor must have no explicit return type
    A Java constructor cannot be abstract, static, final, and synchronized
     */
    static  Integer cnt = 0;
    int student_rno = 0;//   Instanc variable
    String student_Name=" default name";// Instanc variable  ( Instance variable is the variable declared inside oops_exa.Package_exa.a class, but outside oops_exa.Package_exa.a method:)
    static String  static_Name="sdf";
    exa1(){
        System.out.println("default constructor is called ");
        cnt++;
        System.out.println("value of  count : "+cnt);
    }
    exa1(String student_Name , int student_rno){
        this.student_Name=student_Name;
        this.student_rno=student_rno;
    }
    void disp(){
        System.out.println("exa1.disp   this:   "    + this.getClass() );
        System.out.println(student_Name+ "   "+student_rno);
        System.out.println(this.student_Name+ "  \"using this \" "+this.student_rno);
        System.out.println("Static name   " +static_Name);
    }
    void chg_exa1_stat(exa1 other){
        System.out.println("name of obj : "+other.student_Name );
        System.out.println("static name befor change     "+static_Name );
        static_Name = other.student_Name;
        System.out.println("static name is changerd to name of "+this.student_Name +" student name  "+static_Name);
    }

    void add(Integer a , Integer b){
        new exa1();

        // "Integer is oops_exa.Package_exa.a warapper class , by using oops_exa.Package_exa.a wrapper class we can access new functionality in which we cant use if the variable is primitive
        // by using "Integer we declare "oops_exa.Package_exa.a" as an object and it is stored in heap memory
        int op = (a.byteValue()+b.byteValue());
        System.out.println(op);
    }

}
    public class oops_obj_static_final_examp {
        public static void main(String[] args) {
            new exa1().add(10,15); // this is oops_exa.Package_exa.a anonymous object
            //Anonymous simply means nameless. An object which has no reference is known as an anonymous object. It can be used at the time of object creation only.
            //If you have to use an object only once, an anonymous object is oops_exa.Package_exa.a good approach
            // """  new exa1() """    is oops_exa.Package_exa.a anonymous object and """ new exa1().add(10 , 15 ) """ is calling oops_exa.Package_exa.a method using anonynmous object
            exa1 s1 = new exa1();
            s1.disp();
            s1.student_Name="s1 name" ;
            exa1 s2 = new exa1();
            s2 = s1; // coppies values of s11 to s2;
            s2.disp();
            s2.student_rno = 10;
            s2.student_Name="s2 name";
            System.out.println("changed s2 std_rno  and name  ");
            s2.chg_exa1_stat(s2);
            System.out.println(" changed static nae of s2");
            s2.disp();
            System.out.println("  s1 static name : ");
            s1.disp();
           exa1 s3 = new exa1();
            System.out.println("    S3   IS CREATED   ");
           s3.student_rno= 50;
           s3.student_Name="s3 name ";
           s3.disp();
           exa1 s4 = new exa1();
            System.out.println( "      S4   IS CREATED    ");
           s4.student_Name=" s4 ram";
           s4.student_rno = 80;
           s4.disp();
           s4.chg_exa1_stat(s3);
           s4.disp();
           s3.disp();
           final exa1 s5 = new exa1("venkat",500);
                   s5.student_Name="Raman";
                  s5.student_Name = s4.student_Name;
              ///     s5 = new exa1("venkat " , 100);   this   is not acceptableas ,  we can change values of object but we cannot reassign object if it is declared final
            //  s5 = s4;   this is also not acceptable
                s4 = s2;  //  no error here;
            s4 = new exa1("ram", 100); // no error here
            int a[][] = new int[10][10];

        }
}
