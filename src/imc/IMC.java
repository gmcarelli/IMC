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

    public static BigDecimal calculaIMC(String peso, String altura) throws DivByZero {
        BigDecimal pesoAux, alturaAux, imc;

        if (IsNumberValid.IsNumberValid(peso) && IsNumberValid.IsNumberValid(altura)) {

            pesoAux = new BigDecimal(peso).setScale(2);
            System.out.println(pesoAux);

            alturaAux = new BigDecimal(altura).setScale(2);
            System.out.println(alturaAux);

            if (alturaAux.toString().equals("0.00")) {

                throw new DivByZero();

            } else {

                imc = pesoAux.divide(
                        alturaAux.multiply(alturaAux).setScale(2), 2, RoundingMode.DOWN);
            }

        } else {

            imc = new BigDecimal("0");

        }

        return imc;
    }

}
