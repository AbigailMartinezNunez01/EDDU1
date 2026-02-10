
package eva1_8_arreglos;


public class EVA1_8_ARREGLOS {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] datos= new int [10];//-->4 Gigas en la memoria RAM, que la computadora llena de numeros en cuestion de segundos 
        for(int i =0; i<datos.length; i++){
            datos [i]=(int)(Math.random()*100);
        }
        for(int i =0; i<datos.length; i++){
            System.out.print("["+datos[i]+"]");
        }
        System.out.println("");

    }
    
    
}
