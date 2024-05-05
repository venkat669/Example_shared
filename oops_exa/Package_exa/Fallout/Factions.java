package oops_exa.Package_exa.Fallout;

public class Factions {
    String Leadname;
    String Special_weapon;
    String Power_lvl;

    static int unit;

     Factions(String leadname, String special_weapon, String power_lvl) {
        Leadname = leadname;
        Special_weapon = special_weapon;
        Power_lvl = power_lvl;
    }
    void Overload_Method(int a , String b){
        System.out.println(a+b+"  Long b ");
    }
    void Overload_Method(int a , long b){
        System.out.println(a+b+"  Long b ");
    }

    void Overload_Method(int a , float b){
        System.out.println(a+b+"  Float  b  ");
    }

    void disp(){
        System.out.println(this.Leadname+"  "+ this.Power_lvl + "  "+ this.Special_weapon);
    }



}
