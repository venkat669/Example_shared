package oops_exa.Package_exa.Fallout;

public class BrotherHood extends minituemen{
    BrotherHood(String leadname, String special_weapon, String power_lvl, int Settlement) {
        super(leadname, special_weapon, power_lvl, Settlement);
    }

    public static void main(String[] args) {
        Factions BroHood = new BrotherHood("Maxon", "T-60", "High",200);
        BroHood.disp();
        Factionpower(mint.unit, BroHood.unit);

        

    }


}
