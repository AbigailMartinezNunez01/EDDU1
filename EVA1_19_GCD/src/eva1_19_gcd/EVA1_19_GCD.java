
package eva1_19_gcd;


public class EVA1_19_GCD {

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Maximo comun divisor de 180 y 48 es:"+gcd(180,48));
    }
    public static int gcd(int val1, int val2){
        if (val2==0)
            return val1;
        return gcd(val2,val1 % val2); //llamada recursiva, eso quiere decir que se esta dividiendo
            
    }
    
}
