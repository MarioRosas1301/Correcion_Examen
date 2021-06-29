
package test;

import dominio.Examen;
import java.util.Random;
import java.util.Scanner;

public class testExamen {
    static Scanner coordenadas = new Scanner(System.in);
    public static void main(String [] args){
         System.out.println("Cuantas coordenadas desea saber: ");
        int n = coordenadas.nextInt();
        int x,y = coordenadas.nextInt();
        Examen [] exa  = new Examen [n];
        puntoInicial(exa);
        numeroRandom(exa);
        System.out.println("------------------------------------------------------");
        
    }
    public static void puntoInicial(Examen ex []){
        int punto=0 ;
        System.out.println("Las coordenadas en el punto inicial es: "+punto+","+punto);
    }
    
    public static int numeroRandom(Examen ex []){
    Random random = new Random();
    double sumatotal=0;
    for(int i=0; i<ex.length;i++){
        int x=(random.nextInt(100)-50);
        int y=(random.nextInt(100)-50);
        System.out.println("------------------------------------------------------");
        System.out.println("Las coordenadas aleatorias del punto son: " +x+"  , "+y);
        double distancia=Math.sqrt(x*x+y*y);
        sumatotal+=distancia;
        System.out.println("Distancia parcial: "+distancia);
        }
    System.out.println("DISTANCIA TOTAL: "+sumatotal);
        return 0;
    } 
}
