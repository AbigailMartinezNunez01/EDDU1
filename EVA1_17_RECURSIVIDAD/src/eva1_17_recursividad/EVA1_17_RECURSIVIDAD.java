
package eva1_17_recursividad;

public class EVA1_17_RECURSIVIDAD {

    
    public static void main(String[] args) {
        
        // TODO code application logic here
        imprimirLista(5);
        System.out.println("");
        imprimirListaRec(5);
        System.out.println("");
        imprimirListaRecUp(5);
        System.out.println("");
        
    }
    public static void imprimirLista(int val){
        for(int i =val; i > 0; i--)
            System.out.println(i+"-");
    }
    public static void imprimirListaUp(int val){
        for(int i = 1; i <= val; i++)
            System.out.println(i +"-");
   }
    public static void imprimirListaRec(int val){
        //seccion que resuelve el problema
        System.out.println(val +"-");
        if(val> 1)//detener la recursividad
            imprimirListaRec(val-1);
    }
    
    public static void imprimirListaRecUp(int val){
        if(val>1)//detener la recursividad
            imprimirListaRecUp(val-1);
        
        System.out.println(val +"-");
    }
}
