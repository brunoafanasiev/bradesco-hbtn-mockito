package mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CalculadoraTest {

    @Test
    public void testSomarComMock() {
        ServicoMatematico servicoMock = Mockito.mock(ServicoMatematico.class);
        when(servicoMock.somar(2, 3)).thenReturn(5);
        Calculadora calculadora = new Calculadora(servicoMock);
        int resultado = calculadora.somar(2, 3);
        assertEquals(5, resultado);
    }
}
