/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import java.math.BigDecimal;

/**
 *
 * @author gilca
 */
public class IsNumberValid {
    
    public static boolean IsNumberValid(String value) {
        
        boolean IsNumberValid = false;
        
        try {
            
            BigDecimal bigDecimal = new BigDecimal(value);            
            
            IsNumberValid = true;
            
        } catch (Exception e) {
            
            System.out.println("O valor informado não é um número real válido.");
            
        }
        
        return IsNumberValid;
    }
    
}
