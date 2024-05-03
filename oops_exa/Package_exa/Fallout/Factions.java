package oops_exa.Package_exa.Fallout;

public class Factions {
    String Leadname;
    String Special_weapon;
    String Power_lvl;
    static int unit;
    public static void Factionpower(Factions obj1 , Factions obj2){
        if( obj1.unit >obj2.unit){
            System.out.println(" obj 1 is power  ");
        }
        else {
            System.out.println("ob2 2 is power ");
        }
    }

     Factions(String leadname, String special_weapon, String power_lvl) {
        Leadname = leadname;
        Special_weapon = special_weapon;
        Power_lvl = power_lvl;
    }
    void disp(){
        System.out.println(this.Leadname+"  "+ this.Power_lvl + "  "+ this.Special_weapon);
    }



}
