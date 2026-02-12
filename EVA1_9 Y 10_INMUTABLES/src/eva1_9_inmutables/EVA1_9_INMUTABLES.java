
package eva1_9_inmutables;


public class EVA1_9_INMUTABLES {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] datos = new int[5];

        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int)(Math.random() * 100);
        }

        for (int i = 0; i < datos.length; i++) {
            System.out.print("[" + datos[i] + "]");
        }

        System.out.println();
        System.out.println("----NUEVOS VALORES DE DATOS---");

        // respaldo del arreglo original
        int[] respaldo = datos;//tanto respaldo como datos saben donde esta 

        // nuevo arreglo con la MISMA variable
        datos = new int[3];

        // copia de datos
        for (int i = 0; i < datos.length; i++) {
            datos[i] = respaldo[i];
        }

        // impresión final
        for (int i = 0; i < datos.length; i++) {
            System.out.print("[" + datos[i] + "]");
        }
          
    }    
    
}
