
package eva1_20_potenciadeunnum;

import java.util.Scanner;


public class EVA1_20_POTENCIADEUNNUM {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa la base: ");
        int base = input.nextInt();

        System.out.print("Ingresa el exponente: ");
        int exponente = input.nextInt();

        int resultado = potencia(base, exponente);

        System.out.println("La potencia es: " + resultado);
    }

    public static int potencia(int base, int exponente) {

        // caso base
        if (exponente == 1) {
            return base;
        }

        //llamada recursiva
        return base * potencia(base, exponente - 1); //esto es lo que resuelve el problema , llamada recursiva
    }
}
