
package eva1_15_arreglos_multi;


public class EVA1_15_ARREGLOS_MULTI {

  
    public static void main(String[] args) {
        // TODO code application logic here
        int [][]matriz= new int[3][];
        //tenemos tres filas (no hemos especificado cuantas columnas)
        
        matriz[0]=new int[5];// estoy creando, dentro de matriz[0] un arreglo de 5 enteros
        matriz[1]=new int[2];
        matriz[2]=new int[4];
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                matriz[i][j]=(int)(Math.random()*100);
            }
        }
        
        for(int i=0; i < matriz.length; i++){
            for(int j=0; j<matriz[i].length;j++){
                System.out.print("["+ matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
}
