/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_try_catch;

/**
 *
 * @author jesus
 */
public class EVA3_3_TRY_CATCH {

    public static void main(String[] args) {
        //arrayindexoutofbounds-unchecked
        int[] arreglo=null;
        try{//aqui se genera la excepcion
        arreglo = new int[10];
        arreglo[11]=100;
        }catch(ArrayIndexOutOfBoundsException e){//das la solucion al problema
            e.printStackTrace();
            
        }
        System.out.println("El programa sigue con vida");
        System.out.println(arreglo);
    }
}
