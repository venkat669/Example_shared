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
    void disp(){
        System.out.println(this.Leadname+"  "+ this.Power_lvl + "  "+ this.Special_weapon);
    }



}
