/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imctest;

import imc.IMC;
import java.math.BigDecimal;
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
public class CaseTest3 {
    
    public CaseTest3() {
    }
    
    @Test
    public void caseTest3(){        
        
        BigDecimal imc = IMC.calculaIMC("80.50", "1,90");
        
        assertTrue(imc.equals(new BigDecimal("0")));

    }
}
