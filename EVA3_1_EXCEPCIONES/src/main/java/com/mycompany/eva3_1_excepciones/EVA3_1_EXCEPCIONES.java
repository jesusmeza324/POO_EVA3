/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_1_excepciones;

/**
 *
 * @author jesus
 */
public class EVA3_1_EXCEPCIONES {

    public static void main(String[] args) {
        A();
    }
    public static void A(){
       B();
    }
    public static void B(){
       C();
    }
    public static void C(){
        //Excepciones
        int x=10, y=0;
        int resu=x/y;//aqui se genera la excepcion, se termina el programa
        System.out.println("Resultado: " + resu);
    }
}
