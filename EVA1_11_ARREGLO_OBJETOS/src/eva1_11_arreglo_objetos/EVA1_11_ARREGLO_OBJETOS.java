
package eva1_11_arreglo_objetos;


public class EVA1_11_ARREGLO_OBJETOS {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Ejemplo[] arreglo=new Ejemplo[2]; //estamos creando un arreglo de objeto tipo ejemplo(dato nuevo,una clase) de tamaño 2
        System.out.println(arreglo);
        //arreglo-->Nos permite acceder al arreglo
        arreglo[0]=new Ejemplo();
        arreglo[1]=new Ejemplo();//-->creamos objetos con la posicion en el arreglo 
        //Recordatorio de examen, hasta aqui van 3 direcciones, el arreglo y los objetos en posicion, 0 y 1
        //3 objetos , 3 variables que guardan objetos
        System.out.println(arreglo[0]);//-->Imprimimos las direcciones
        System.out.println(arreglo[1]);
        
        System.out.println(arreglo[0].Val);
        System.out.println(arreglo[1].Val);
        
    }
    
}
class Ejemplo{
    int Val=5;
}
