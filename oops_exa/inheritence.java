package oops_exa;

public class inheritence extends OOPS_conp1 {


    public static void main(String[] args) {
        Student st1 = new Student();
        st1.Student("lex",30,53);
        Student st2 = new Student();
        st2.Student(st1);
        st2.Display();
        st1.Display();
        // this has a  ""   IS-A  "" Relationship
        // here inheritence class inherits function from OOPS_conp1 class
    }
}
