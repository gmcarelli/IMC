/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author gilca
 */
public class DivByZero {
    
     public static boolean isDivByZero(String value) {
        
        boolean isDivByZero = false;
        
        try {
            
            float parseFloat = Float.parseFloat(value);   
            
            if (parseFloat == 0) {
                
                isDivByZero = true;
                
            }
            
        } catch (Exception e) {
            
            System.out.println("O valor informado não é um número real válido.");
            //throw new NumberFormatException("O valor informado não é um número real válido.");
            
        }
        
        return isDivByZero;
    }
    
}
