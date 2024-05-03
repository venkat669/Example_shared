package oops_exa.Package_exa.Fallout;

public class minituemen extends Factions {
    public static   int Settlement ;

    minituemen(String leadname, String special_weapon, String power_lvl, int Settlement) {
        super(leadname, special_weapon, power_lvl);
        this.Settlement = Settlement;
        this.unit = this.Settlement;
    }

//     minituemen(int settlement) {
//        Settlement = settlement;
//
//
//        }


    public static void main(String[] args) {
       Factions mint = new minituemen("preston","leser Rifel","weak",190);

//      minituemen min =new minituemen(100);
      mint.disp();;
        System.out.println(mint);

    }
}
