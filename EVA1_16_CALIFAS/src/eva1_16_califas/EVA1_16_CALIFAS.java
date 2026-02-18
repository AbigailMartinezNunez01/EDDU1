
package eva1_16_califas;

import java.util.Scanner;


public class EVA1_16_CALIFAS {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        int[][] grupos;//NO SE CUANTOS GRUPOS SON, LO INDICA EL USUARIO
        System.out.println("¿Cuantos grupos tiene la escuela?");
        int cant=input.nextInt();
        grupos=new int[cant][];
        for(int i=0; i < grupos.length; i++){ //recorremos cada grupo para caspturar
            System.out.println("¿Cuantos estudiantes tiene el grupo?"+(i+1)+"?");
            int estudiantes =input.nextInt();
            input.nextLine();
            grupos[i]=new int [estudiantes];
        }
        //capturar calificaciones
        for(int i=0; i< grupos.length; i++){
            System.out.println("++++++GRUPO"+(i+1) + "+++++++");
            for(int j=0; j< grupos[i].length; j++){
                System.out.println("calificacion del estudiante" + (j+1) + ":");
                int califa =input.nextInt();
                grupos[i][j]=califa;
                input.nextLine();
            }
        }
        //imprimir calificaciones
        System.out.println("\n-----CALIFICACIONES-----");
        for(int i=0; i< grupos.length; i++){
            System.out.println("GRUPO " + (i+1));
            for(int j=0; j< grupos[i].length; j++){
                System.out.print("[" + grupos[i][j] + "] ");
            }
            System.out.println("\n");
        }
        
        //calculen el promedio de calificaciones
        double sumaGeneral = 0;
        int totalAlumnos = 0;
        
        System.out.println("----- PROMEDIOS POR GRUPO -----");
        for(int i=0; i< grupos.length; i++){
            int sumaGrupo = 0;
            
            for(int j=0; j< grupos[i].length; j++){
                sumaGrupo += grupos[i][j];
            }
            
            double promedioGrupo = (double)sumaGrupo / grupos[i].length;
            System.out.println("Promedio del grupo " + (i+1) + ": " + promedioGrupo);
            
            sumaGeneral += sumaGrupo;
            totalAlumnos += grupos[i].length;
        }
        
        double promedioGeneral = sumaGeneral / totalAlumnos;
        System.out.println("\nPromedio general de la escuela: " + promedioGeneral);
        
        
        
    }
    
}
