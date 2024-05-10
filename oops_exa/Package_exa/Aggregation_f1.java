package oops_exa.Package_exa;

public class Aggregation_f1 {
    //  this is example of aggregation , this file uses values and constructor in class Subject
    int Stdrno;
    int stdgrade;
    String Section;
    int marks;
    Subject subj;
    String Name;

    public Aggregation_f1(String Name ,int stdrno, int stdgrade, String section, int marks, Subject subj) {
        Stdrno = stdrno;
        this.stdgrade = stdgrade;
        Section = section;
        this.marks = marks;
        this.subj = subj;
        this.Name=Name;
    }
    void Disp(){
        System.out.println(this.Name+"   "+this.Section+ "  "+this.Stdrno+"  "+subj.phics+" : physics "+subj.eng+" :english "+subj.mat+" : Maths " );
    }

    public static void main(String[] args) {
        Subject sub1 = new Subject(90,98,93);
        Subject sub2 = new Subject(93,91,97);
        Aggregation_f1 s1 = new Aggregation_f1("Kumar",001,05,"Sec A",80,sub1);
        Aggregation_f1 s2 = new Aggregation_f1(" Ram ",002,05,"Sec B",89,sub2);
         s2.Disp();
         s1.Disp();
    }
}
