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
public class IsFloat {
    
    public static boolean isFloat(String value) {
        
        boolean isFloat = false;
        
        try {
            
            Float.parseFloat(value);            
            
            isFloat = true;
            
        } catch (Exception e) {
            
            System.out.println("O valor informado não é um número real válido.");
            
        }
        
        return isFloat;
    }
    
}
