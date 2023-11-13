import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegerTest {

    @Test
    public void testMultiplicacionNumerosPositivos() {
        int resultado = Integer.multiplicar(2, 3);
        Assert.assertEquals(resultado, 6);
    }

    @Test
    public void testMultiplicacionPositivoPorCero() {
        int resultado = Integer.multiplicar(5, 0);
        Assert.assertEquals(resultado, 0);
    }

    @Test
    public void testMultiplicacionNegativoPorPositivo() {
        int resultado = Integer.multiplicar(-4, 2);
        Assert.assertEquals(resultado, -8);
    }
}
