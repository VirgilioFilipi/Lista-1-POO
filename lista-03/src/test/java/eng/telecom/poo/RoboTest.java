package eng.telecom.poo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoboTest {

    @Test
    public void retornoCoordenada() {
        Robo cv = new Robo("rdx", 15,  new int[]{5, 6,}, "Norte", 5,90 ,2);
        assertEquals(5,cv.getCoordenada()[0]);
        assertEquals(6,cv.getCoordenada()[1]);
    }


    @Test
    void deslocar() {
        Robo cc = new Robo("rdx", 15,  new int[]{5, 6,}, "Leste", 5,10 ,1);
        assertEquals(true,cc.Deslocar());

    }
    @Test
    public void retornoCoordedanaAnterior(){
        Robo cv = new Robo("rdx", 15,  new int[]{5, 6,}, "Norte", 5,90 ,2);
        assertEquals(5,cv.getCoordenada()[0]);
        assertEquals(6,cv.getCoordenada()[1]);

    }

    @Test
    void girarRobo() {
        Robo cc = new Robo("rdx", 15,  new int[]{5, 6,}, "Leste", 5,80 ,20);
        assertEquals("Sul",cc.girarRobo("D"),"D");
        assertEquals("Oeste",cc.girarRobo("D"),"D");
        assertEquals("Norte",cc.girarRobo("D"),"D");
        assertEquals("Leste",cc.girarRobo("D"),"D");
        assertEquals("Norte",cc.girarRobo("E"),"E");
        assertEquals("Oeste",cc.girarRobo("E"),"E");
        assertEquals("Sul",cc.girarRobo("E"),"E");
        assertEquals("Leste",cc.girarRobo("E"),"E");
    }

    @Test
    void getIdentificador() {
    }

    @Test
    void setIdentificador() {
    }

    @Test
    void getArea() {
    }

    @Test
    void setArea() {
    }

    @Test
    void getAreaLateral() {
    }

    @Test
    void getCoordenada() {
    }

    @Test
    void setCoordenada() {
    }

    @Test
    void getOrientacao() {
        Robo cv = new Robo("rdx", 15,  new int[]{5, 6,}, "Norte", 5,90 ,2);
        Robo cc = new Robo("rdx", 15,  new int[]{5, 6,}, "Leste", 5,90 ,2);
        assertEquals("Norte",cv.getOrientacao());
        assertEquals("Leste",cc.getOrientacao());

    }

    @Test
    void setOrientacao() {
    }

    @Test
    void getMovimentosRestantes() {
        Robo cv = new Robo("rdx", 15,  new int[]{5, 6,}, "Norte", 5,80 ,5);
        assertEquals(16,cv.getMovimentosRestantes());
    }
}