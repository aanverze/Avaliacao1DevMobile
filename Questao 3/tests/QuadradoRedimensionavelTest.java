import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadradoRedimensionavelTest {
    @Test
    public void deveImplementarRedimensionavel() {
        QuadradoRedimensionavel qr = new QuadradoRedimensionavel(10);
        assertTrue(qr instanceof Redimensionavel);
    }

    @Test
    public void deveEstenderQuadrado() {
        assertTrue(Quadrado.class.isAssignableFrom(QuadradoRedimensionavel.class));
    }

    @Test
    public void deveFuncionarORedimensionamento() {
        QuadradoRedimensionavel qr = new QuadradoRedimensionavel(10);
        qr.redimensionar(10);

        assertEquals(11, qr.getLado());
    }
}