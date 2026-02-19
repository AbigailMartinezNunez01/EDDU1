
package eva1_18_factorial;


public class EVA1_18_FACTORIAL {

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("FACTORIAL DE 5="+factorialFor(5));
        System.out.println("Factorial de 5="+factorialRec(5));
        
    } 
    public static int factorialFor(int valor){
        int resu=1;
        for(int i=1; i<=valor; i++){
            resu=resu*i;
        }
        return resu;
    }
    public static int factorialRec (int val){//FactorialRec se manda a llamar asi mismo
        if(val>0)
        return val *factorialRec(val-1);
        else 
            return 1;
    }
    
}
