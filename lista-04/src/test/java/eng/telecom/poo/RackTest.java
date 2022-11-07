package eng.telecom.poo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RackTest {

    @Test
    void adicionaMaquinaReal() {
        Rack tx = new Rack("tx");
        assertTrue(tx.adicionaMaquinaReal("mr0",16,500));
        assertTrue(tx.adicionaMaquinaReal("mr1",8,1000));
        assertTrue(tx.adicionaMaquinaReal("mr2",16,500));
        assertTrue(tx.adicionaMaquinaReal("mr3",8,1000));
        assertTrue(tx.adicionaMaquinaReal("mr4",16,500));

        assertFalse(tx.adicionaMaquinaReal("mr5",16,500));
    }

}