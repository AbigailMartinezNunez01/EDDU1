
package eva1_7_arreglos;


public class EVA1_7_arreglos {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //String [] cade 1, cade 2, cade 3;-->todos son arreglos
        //String cade1, cade2[], cade3--> solo cade2 es arreglo
        int [] datos=new int [10];//40 bytes 
        //MANEJO DE INDICES:
        System.out.println(datos);
        datos[0]=100;
        datos[1]=200;
        datos[2]=300;
        datos[9]=1000;
        //datos[10]=1100; //posicion 10 no existe(la ultima es 9)-->Esta linea nos va generar un error en el codigo 
        System.out.println("Valor en posicion 0="+datos[0]);   
    }
    
}
