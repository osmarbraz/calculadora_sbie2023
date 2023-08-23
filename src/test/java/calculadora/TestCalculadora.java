package calculadora;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCalculadora {

    @Test
    public void testGetSoma() {
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        double retornoEsperado = 6.0;
        double retornoFeito = calculadora.getSoma();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    public void testGetDiferenca() {
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        double retornoEsperado = 2.0;
        double retornoFeito = calculadora.getDiferenca();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}
