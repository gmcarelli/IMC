/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imctest;

import imc.DivByZero;
import imc.IMC;
import java.math.BigDecimal;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gilca
 */
public class TestCase2 {

    public TestCase2() {
    }

    @Test
    public void caseTest2() throws DivByZero{
        
        BigDecimal imc = IMC.calculaIMC("p.50", "1.90");
        
        assertTrue(imc.equals(new BigDecimal("0")));

    }
}
