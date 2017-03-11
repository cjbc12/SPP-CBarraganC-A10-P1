/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.cbarraganc.a10.p1;
import java.util.Scanner;
/**
 *
 * @author Barra
 */
public class SPPCBarraganCA10P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamaño = getSize();
        int [][] a = arreglo ("A", tamaño);
        int [][] b = arreglo ("B", tamaño);
        
        Matrix (a,b);
       
    }
    public static int getSize(){
        Scanner key = new Scanner (System.in);
        boolean flag;
        int a = 0;
        do{
            try{
                System.out.println("Tamaño del arreglo: ");
                a = key.nextInt();
                flag = false;
            }
            catch (Exception e){
                System.out.println("¡Error!");
                key.next();
                flag = true;
            }
        }
        while (flag);
        return a;
    }
    public static int getInt(){
        Scanner key = new Scanner (System.in);
        boolean flag;
        int a = 0;
        do{
            try{
                System.out.println("Inserta un número entero: ");
                a = key.nextInt();
                flag = false;
            }
            catch (Exception e){
                System.out.println("¡Error!");
                key.next();
                flag = true;
            }
        }
        while (flag);
        return a;
    }
    public static int [][] arreglo (String a, int tamaño){
        int [][]arreglo = new int [tamaño][tamaño];
        System.out.println("Arreglo: " + a);
        for (int[] arreglo1 : arreglo) {
            for (int j = 0; j < arreglo1.length; j++) {
                arreglo1[j] = getInt();
            }
        }
        return arreglo;
    }
    public static int [][] Matrix (int [][]a, int[][]b){
        int [][] r = new int [a.length] [a.length];
        System.out.println("Resta: ");
        for (int i = 0; i < a.length; i++){
        for (int j = 0; j < a[i].length; j++){
        r[i][j] = a[i][j] - b[i][j];
        System.out.println("["+r[i][j]+"]");   
    }
    }
        return r; 
    }
    
}