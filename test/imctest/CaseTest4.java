/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imctest;

import imc.DivByZero;
import imc.IMC;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gilca
 */
public class CaseTest4 {

    public CaseTest4() {
    }

    @Test(expected = DivByZero.class)
    public void caseTest4() throws DivByZero {

        BigDecimal imc = IMC.calculaIMC("80.50", "0");

        assertTrue(imc.equals(new BigDecimal("0")));

    }
}
