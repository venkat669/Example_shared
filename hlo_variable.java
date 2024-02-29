public class hlo_variable {
    public static void main(String args[]){
        System.out.println("hello its java");
         int a;//declararion
         a=5;            //assignment
         int x= 19;  //initialization
        System.out.println( x );
        System.out.println( a );
        System.out.println("ths is using println as example ");
        System.out.println(x   +" "+   a);
        System.out.printf("this is using printf  %d     %d    \n", x,a);
         /*both are examples of printing 2 variable in same print statement;
        *this is multi line comment
        * the following is swaping of variables
          */
        int temp;
        temp= x;
        x=a;
        a=temp;
        System.out.println(x+"   "+a); //thus x is swapped with a
    }
}
