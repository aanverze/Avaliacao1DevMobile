import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CilindroTest {
    @Test
    void getBaseDeveRetornarCorretamente() {
        Cilindro c = new Cilindro();
        assertEquals(1.0, c.getBase().getRaio());
    }

    @Test
    void getAlturaDeveRetornarCorretamente() {
        Cilindro c = new Cilindro();
        assertEquals(1.0, c.getAltura());
    }
}