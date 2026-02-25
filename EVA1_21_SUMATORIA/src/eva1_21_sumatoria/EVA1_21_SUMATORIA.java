
package eva1_21_sumatoria;


public class EVA1_21_SUMATORIA {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("La sumatoria de 5="+ Sumatoria(5));
        
    }
    public static int Sumatoria (int n){
        if (n==0){
          return n;  
        }
         return n+Sumatoria(n-1);
    }
    
}

