package app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

public class SomaTest {
    Soma soma;

    @BeforeEach
    public void beforeEach(){
        soma = new Soma();
    }

    @Test
    public void testBase(){
        double result = soma.Soma(10, 3);
        assertEquals(13, result);
    }


    @Test
    public void somaNegativo(){
        double result = soma.Soma(10, -3);
        assertEquals(7, result);
    }
}