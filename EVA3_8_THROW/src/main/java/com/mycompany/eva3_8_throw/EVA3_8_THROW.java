/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_throw;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class EVA3_8_THROW {

    public static void main(String[] args) {
        try {
            division(100,0);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void division(int val1,int val2) throws Exception{
        if(val2==0)
            throw new Exception("Valor no permitido,causa divsion entre cero");
        
        System.out.println("Division= "+(val1/val2));
        
    }
}
