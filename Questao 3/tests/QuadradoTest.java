import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadradoTest {
    @Test
    public void deveImplementarGeometria() {
        Quadrado q = new Quadrado(10);
        assertTrue(q instanceof Geometria);
    }

    @Test
    public void areaDeveSerCalculadaCorretamente() {
        Quadrado q = new Quadrado(10);
        assertEquals(100, q.area());
    }

    @Test
    public void perimetroDeveSerCalculadoCorretamente() {
        Quadrado q = new Quadrado(10);
        assertEquals(40, q.perimetro());
    }
}