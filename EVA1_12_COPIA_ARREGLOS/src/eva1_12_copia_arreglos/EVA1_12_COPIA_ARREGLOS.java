
package eva1_12_copia_arreglos;

public class EVA1_12_COPIA_ARREGLOS {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Ejemplo[] arreglo=new Ejemplo[2];  
        System.out.println("arreglo"+arreglo);
        
        arreglo[0]=new Ejemplo();
        arreglo[1]=new Ejemplo();
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println("arreglo[0]="+arreglo[0]);
        System.out.println("arreglo[1]="+arreglo[1]);
        
        
        System.out.println(arreglo[0].Val);
        System.out.println(arreglo[1].Val);
        //Ejemplo[]copia=arreglo; //NO FUNCIONA, CREO UN DUPLICADO DE LA DIRECCION 
        Ejemplo[] copia=new Ejemplo [2]; //DEBO CREAR UN NUEVO ARREGLO
        System.out.println("copia="+copia);
        //CREAR UN "BACKUP" DE UN OBJETO IMPLICA CREAR O INSTANCIAR OTRO OBJETO 
        //QUE SERVIRA DE RESPALDO
        copia[0]=new Ejemplo();
        copia[1]=new Ejemplo();
        System.out.println("copia[0]="+copia[0]);
        System.out.println("copia[1]="+copia[1]);
        //ahora si, hay que transferir la info de un objeto a otro (siempre y cuando
        //esa info no sean objetos tambien)
        copia[0].Val=arreglo[0].Val;
        copia[1].Val=arreglo[1].Val;
        
        
}
        //posicion por posicion copiar de un arreglo a otro: 
        //ESTO NO SIRVE TAMPOCO
        //copia[0]=arreglo[0];
        //copia[1]=arreglo[1];
        
        
    }
    
 
class Ejemplo{
    int Val=5;
}
