/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_5_controlar_excepciones;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA3_5_CONTROLAR_EXCEPCIONES {

    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        int val1,val2;
        
        System.out.println("Introduce un numero: ");
        val1=cap.nextInt();
        System.out.println("Introduce otro numero");
        val2=cap.nextInt();
        do{
            System.out.println("Introduce otro numero:");
            val2=cap.nextInt();
        }while(val2==0);
        System.out.println("La division es "+(val1/val2));
            
                
            
        
    }
}
