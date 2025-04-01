/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_7_finally;

import java.util.InputMismatchException;

/**
 *
 * @author jesus
 */
public class EVA3_7_FINALLY {

    public static void main(String[] args) {
        //TODO code appliaction here
        try{
            int x=100,y=0;
            int resu=x/y;
            System.out.println("resu");
        }catch(ArithmeticException ex){
           
            System.out.println("Bloque catch");
            
            //ex.printStackTrace();
        }finally{//siempre se ejecuta
             int[] arreglo= new int [2];//ups
            arreglo[5]=0;
            System.out.println("esto siempre se ejecuta");
        }
        System.out.println("fin del programa");
    }
}
