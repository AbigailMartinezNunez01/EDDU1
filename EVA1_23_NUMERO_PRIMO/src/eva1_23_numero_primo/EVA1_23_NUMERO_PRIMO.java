
package eva1_23_numero_primo;

import static java.lang.Math.sqrt;


public class EVA1_23_NUMERO_PRIMO {

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("El numero 537 es primo?"+esPrimoNoEficiente(537));
        System.out.println("El numero 537 es primo?"+esPrimoEficiente(537));
    }
    public static boolean esPrimoNoEficiente(int numero){
        boolean esPrimo=true;
        for(int i=2; i<numero; i++){
            if((numero % i)==0){//no es primo
                esPrimo=false;
                break;
            }
        }
       return esPrimo; 
    }
    
    public static boolean esPrimoEficiente(int numero){
        boolean esPrimo=true;
        for(int i=2; i<sqrt(numero); i++){
            if((numero % i)==0){
                esPrimo=false;
            }
        }
        return esPrimo;
    }
    }
        
         
        
