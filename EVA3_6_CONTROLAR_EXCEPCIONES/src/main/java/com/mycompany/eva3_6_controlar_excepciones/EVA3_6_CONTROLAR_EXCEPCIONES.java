/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_6_controlar_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA3_6_CONTROLAR_EXCEPCIONES {

    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        int val1=0,val2=0;
        while(true){
            try{
            System.out.println("Ingrese un numero");
            val1=cap.nextInt();
            System.out.println("Ingrese otro numero:");
            val2=cap.nextInt(); 
            break;
            }
            catch(InputMismatchException e){
                System.out.println("error capture de nuevo:");
                cap.nextLine();
            }
           }
        System.out.println("El resultado es: "+val1/val2);
        
    }
}
