public class leetcddaily1 {
    public static void main(String[] args) {
        r(8);
    }
    static void r(int n){
        int j , i=1;
        int k = n/2;
        int suml = 0,sumr=0;
        while(i<=n){
            if(i<=k){
                suml = suml +i;
                System.out.println(suml);
            }
            if(i>k){
                sumr = sumr + i;
                System.out.println(sumr);
                System.out.println(suml);
                System.out.println(i);
            }
            i=i+1;

        }
    }
}
