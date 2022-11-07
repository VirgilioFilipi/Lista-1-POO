package eng.telecom.poo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaquinaRealTest {

    @Test
    void adicionaMaquinaVirtual() {
        Rack tx = new Rack("tx");
        tx.adicionaMaquinaReal("mr0",8,500);
        assertTrue(tx.getMaquinaReal().get(0).adicionaMaquinaVirtual("mv0",2,100));
        assertTrue(tx.getMaquinaReal().get(0).adicionaMaquinaVirtual("mv1",1,50));

        assertFalse(tx.getMaquinaReal().get(0).adicionaMaquinaVirtual("mv2",2,1000));
        assertFalse(tx.getMaquinaReal().get(0).adicionaMaquinaVirtual("mv3",6,50));

        assertTrue(tx.getMaquinaReal().get(0).adicionaMaquinaVirtual("mv4",1,100));
        assertTrue(tx.getMaquinaReal().get(0).adicionaMaquinaVirtual("mv5",1,10));
        assertTrue(tx.getMaquinaReal().get(0).adicionaMaquinaVirtual("mv6",1,50));

        assertFalse(tx.getMaquinaReal().get(0).adicionaMaquinaVirtual("mv7",1,10));
        assertFalse(tx.getMaquinaReal().get(0).adicionaMaquinaVirtual("mv8",1,20));
    }

    @Test
    void removeMaquinaVirtual() {
        Rack tx = new Rack("tx");
        tx.adicionaMaquinaReal("mr0",8,500);

        tx.getMaquinaReal().get(0).adicionaMaquinaVirtual("mv0",2,100);
        tx.getMaquinaReal().get(0).adicionaMaquinaVirtual("mv1",1,50);
        tx.getMaquinaReal().get(0).adicionaMaquinaVirtual("mv2",1,60);

        assertTrue(tx.getMaquinaReal().get(0).removeMaquinaVirtual("mv1"));
        assertTrue(tx.getMaquinaReal().get(0).removeMaquinaVirtual("mv0"));

        assertFalse(tx.getMaquinaReal().get(0).removeMaquinaVirtual("mv0"));

    }


}