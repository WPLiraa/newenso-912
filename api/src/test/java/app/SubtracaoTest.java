package app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

public class SubtracaoTest {
    Subtracao subtracao;

    @BeforeEach
    public void beforeEach(){
        subtracao = new Subtracao();
    }

    @Test
    public void testBase(){
        double result = subtracao.subt(10, 3);
        assertEquals(7, result);
    }


    @Test
    public void subcZero(){
        double result = subtracao.subt(13, 0);
        assertEquals(13, result);
    }
}