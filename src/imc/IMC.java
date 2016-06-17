/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author gilca
 */
public class IMC {

    public static BigDecimal calculaIMC(String peso, String altura) {
        BigDecimal pesoAux, alturaAux, alturaQ, imc;     
        
        if (IsFloat.isFloat(peso) && IsFloat.isFloat(altura) 
                && !DivByZero.isDivByZero(altura)) {

            pesoAux = new BigDecimal(peso).setScale(2);
            //System.out.println(pesoAux);

            alturaAux = new BigDecimal(altura).setScale(2);
            //System.out.println(alturaAux);

            alturaQ = alturaAux.multiply(alturaAux).setScale(2);
            //System.out.println(alturaQ);

            imc = pesoAux.divide(alturaQ, 2, RoundingMode.DOWN);

        } else {

            imc = new BigDecimal("0");

        }

        return imc;
    }

}

//public static float calcularIMC(String peso, String altura) {
//        float pesoAux, alturaAux, imc;
//
//        if (IsFloat.isFloat(peso) && IsFloat.isFloat(altura)) {
//
//            pesoAux = new Float(peso);
//
//            alturaAux = new Float(altura);
//
//            imc = pesoAux / (alturaAux * alturaAux);
//
//        } else {
//
//            imc = 0;
//
//        }
//
//        return imc;
//    }