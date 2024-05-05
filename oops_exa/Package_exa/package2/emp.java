package oops_exa.Package_exa.package2;

public class emp {
    String Name;
    int id;
    int salary ;
    Addr addr;  //   addr object is created
    emp(String Name, int id , int salary,Addr addr ){
        this.Name = Name;
        this.id = id;
        this.salary = salary;
        this.addr = addr;   //    each employee gets a addr object for him

    }
    void disp(){
        System.out.println(this.Name + "  "+ addr.city+"   "+addr.State+"  "+addr.country+"  "+this.id); //   in constructor of e1 a1 addr is passed
        //  since a1 object is passed for e1 , asscessing e1 disp() with addr.city gives  address of a1
    }

    public static void main(String[] args) {
        Addr a1 = new Addr("chennai" , "TN" , "IND"); //   object a1 , a2 created
        Addr a2 = new Addr("Dallas","TX", "USA");
        emp e1 = new emp("venkat",50000,50000,a1);  // a1 and a2 are passed for e1 and e2
        emp e2 = new emp("Ram",50000,50000,a2);
        e1.disp();;
        e2.disp();


    }
}
