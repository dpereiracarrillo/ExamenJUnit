package mcd;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParamCalculoTest {

    private int num1;
    private int num2;
    private Calculo instance;
    private int expResult;

    @Before
    public void initialize() {
        instance = new Calculo();
    }

    public ParamCalculoTest(int n1, int n2, int mcd) {
        this.num1 = n1;
        this.num2 = n2;
        this.expResult = mcd;
    }

    @Parameterized.Parameters
    public static Collection calculando() {
        return Arrays.asList(new Object[][]{
            {10, 4, 2},
            {2, 2, 2},
            {12, 4, 4},
            {12, 3, 3}
        });
    }

    /**
     * Test of obtenerMCD method, of class Calculo.
     */
    @Test
    public void testObtenerMCD() {
        System.out.println("obtenerMCD" + " numero 1 "+num1 + " numero 2 "+num2 + " resultado "+expResult);
        int result = instance.obtenerMCD(num1, num2);
        assertEquals(expResult, result,0);
    }

}