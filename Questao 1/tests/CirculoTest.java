import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    @Test
    void newCirculoDeveCriarRaio1() {
        Circulo c = new Circulo();

        double expected = 1.0;
        assertEquals(expected, c.getRaio());
    }

    @Test
    void newCirculoComParametroDeveSerSetadoCorretamente() {
        double expected = 2.5;
        Circulo c = new Circulo(expected);
        assertEquals(expected, c.getRaio());
    }

    @Test
    void setRaioDeveInserirOValorCorreto() {
        double expected = 3;
        Circulo c = new Circulo();
        c.setRaio(expected);
        assertEquals(expected, c.getRaio());
    }

    @Test
    void areaDeveSerCalculadaCorretamente() {
        double expected = Math.PI * 2 * 2;
        Circulo c = new Circulo(2);
        assertEquals(expected, c.area());
    }

    @Test
    void perimetroDeveSerCalculadoCorretamente() {
        double expected = 2 * Math.PI * 3;
        Circulo c = new Circulo(3);
        assertEquals(expected, c.perimetro());
    }

    @Test
    void testToString() {
        String expected = "Circulo{raio=1.0}";
        Circulo c = new Circulo();
        assertEquals(expected, c.toString());
    }
}