package oops_exa.Package_exa.Fallout;
// below is example of inheritence ( IS - A)
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
      mint.disp();;   // disp function is derived from factions
        mint.Overload_Method(10,3.14f);
        mint.Overload_Method(40,20);
        mint.Overload_Method(40,40^40000000);
        mint.Overload_Method(40, (long) 92233720368547750E5);
        mint.Overload_Method(40," str ");   //   example for method overloading   (   via inheritence )
        System.out.println(mint);

    }
}
