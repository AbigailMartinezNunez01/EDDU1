
package eva1_13_arreglos.multi;


public class EVA1_13_ARREGLOSMULTI {
final static int FILAS=5;
final static int COL=3;
   
    public static void main(String[] args) {
        // TODO code application logic here}
        int[][] arreglo= new int[FILAS][COL]; //5 FILAS POR 3 COLUMNAS=15 ENTEROS
        //ACCESO POR INDICES
        //PRIMER POSICION:
        arreglo[0][0]=100;
        //INTERMEDIA:
        arreglo[3][1]=500;
        //ULTIMA POSICION
        arreglo[4][2]=1600;
        for(int i=0; i <FILAS; i++ ){//-->PRIMER DIMENSION -->FILAS
            for (int j=0; j <COL; j++){//SEGUNDA DIMENSION-->COL
                arreglo[i][j]=(int)(Math.random()*100);
            }
            
        }
        //DOS DIMENSIONES--> DOS CICLOS FOR PARA PODER RECORRER EL ARREGLO
        for(int i=0; i <FILAS; i++ ){//-->PRIMER DIMENSION -->FILAS
            for (int j=0; j <COL; j++){//SEGUNDA DIMENSION-->COL
                System.out.println("["+arreglo[i][j]+"]"); 
                
            }
            System.out.println("");
        }  
        System.out.println(arreglo+"arreglo");
        System.out.println("arreglo[0]"+arreglo[0]);
        System.out.println("arreglo[1]"+arreglo[1]);
        System.out.println("arreglo[2]"+arreglo[2]);
        System.out.println("arreglo[3]"+arreglo[3]);
        System.out.println("arreglo[4]"+arreglo[4]);
        
    }
    
}
