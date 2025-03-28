/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_tray_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA3_4_TRAY_CATCH {

    public static void main(String[] args) {
        try{
         int[] arreglo = new int[10];
         arreglo[11]=100;
        
        int x=100,y=0;
        int resu=x/y;
        Scanner cap = new Scanner(System.in);
        System.out.println("Valor: ");
        int valor=cap.nextInt();
        }//catch(RuntimeException ex){
            //System.out.println("Culaquier error de ejecucion");
        //}
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Error de indice del arreglo");
        }catch(ArithmeticException ex){
            System.out.println("Division entre cero");
        }catch(InputMismatchException ex){
            System.out.println("Error de captura");
        }
       
        
        
    }
}
