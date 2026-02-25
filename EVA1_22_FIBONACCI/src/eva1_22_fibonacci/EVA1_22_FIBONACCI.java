
package eva1_22_fibonacci;


public class EVA1_22_FIBONACCI {

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Valor Fibonacci en posicion 5="+Fibonacci(5));
        
    }
    public static int Fibonacci(int posicion){
        if(posicion==1){
            return 0;
        }
            if(posicion==2){
                return 1;
                
            }
            return Fibonacci(posicion -1)+Fibonacci(posicion-2);
        
    }
    
}
