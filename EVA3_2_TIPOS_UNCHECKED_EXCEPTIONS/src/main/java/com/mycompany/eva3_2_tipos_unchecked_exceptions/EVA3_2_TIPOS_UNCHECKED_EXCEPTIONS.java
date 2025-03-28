/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_2_tipos_unchecked_exceptions;

import java.io.File;
import java.util.Scanner;



/**
 *
 * @author jesus
 */
public class EVA3_2_TIPOS_UNCHECKED_EXCEPTIONS {

    public static void main(String[] args) {
        //arithmetic exception - unchecked
        int x=10, y=0;
        int resu=x/y;//aqui se genera la excepcion, se termina el programa
        System.out.println("Resultado: " + resu);
        //arrayindexoutofbounds-unchecked
        int[] arreglo = new int[10];
        arreglo[11]=100;
        //nulllpointer exception - unchecked
        Prueba prueba=null;
        prueba.mostrarMensaje();
        //inputmismatch exception - unchecked
        Scanner cap = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int valor =cap.nextInt();
        
    }
}
class Prueba{
    public  void mostrarMensaje(){
        System.out.println("Hola mundo!!");
    }
}