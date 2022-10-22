package eng.telecom.poo;

import java.util.Random;

/**
 * Classe de funcoes do Robo
 *
 * @author Filipi Virgilio
 */

public class Robo {

    private String identificador;
    private int area;
    private int areaLateral;
    private int[] coordenada;
    private String orientacao;
    private int movimentosRestantes;
    private int movimentacao;
    private int movimentoMaximo;
    public int movimentoMax = 100;
    public int movimentoMin = 0;
    public String[] cardeais = {"Norte", "Leste", "Sul", "Oeste"};
    public int testeArea;
    public int[] coordenadaAnterior;

    /**
     *  Robo
     *
     * @param identificador do Robo
     * @param area de uma lateral a ser explorada
     * @param coordenada indica as coordenadas (x,y)
     * @param orientacao pontos cardeais
     * @param movimentosRestantes indica quantos movimentos o Robo ainda pode realizar
     * @param movimentoMaximo movimentacao maxima do Robo
     * @param movimentacao indica a distancia que o Robo pode movimentar em cada etapa
     */

    public Robo(String identificador, int area, int[] coordenada, String orientacao, int movimentosRestantes, int movimentoMaximo, int movimentacao) {
        this.identificador = identificador;
        this.area = area;
        setArea(area);
        this.movimentoMaximo = movimentoMaximo;
        this.coordenada = coordenada;
        coordenadaAnterior = coordenada;
        setCoordenada(coordenada);
        this.orientacao = orientacao;
        this.movimentosRestantes = movimentosRestantes;
        setMovimentosRestantes(movimentacao);

        this.movimentacao = movimentacao;
    }

    /**
     * Metodo para as a localizacao
     * @return as coordenadas (x,y)
     */
    public int[] retornoCoordenada() {
        return getCoordenada();
    }

    /**
     * Metodo responsavel por fazer o Robo se deslocar
     * @return se o Robo se deslocou ou nao
     */
    public boolean Deslocar() {
        String sentido = getOrientacao();


        if (sentido == cardeais[0]) {
            testeArea = getCoordenada()[1] + getMovimentacao();
            if (testeArea <= getAreaLateral() && testeArea >= movimentoMin) {
                coordenadaAnterior = getCoordenada();
                getCoordenada()[1] += getMovimentacao();
                System.out.println(getCoordenada()[0] + "  " + getCoordenada()[1]);
                movimentosRestantes --;
                return true;
            } else {
                return false;
            }
        } else if (sentido == cardeais[1]) {
            testeArea = getCoordenada()[0] + getMovimentacao();
            if (testeArea <= getAreaLateral() && testeArea >= movimentoMin) {
                coordenadaAnterior = getCoordenada();
                getCoordenada()[0] += getMovimentacao();
                System.out.println(getCoordenada()[0] + "  " + getCoordenada()[1]);
                movimentosRestantes --;
                return true;
            } else {
                return false;
            }
        } else if (sentido == cardeais[2]) {
            testeArea = getCoordenada()[1] - getMovimentacao();
            if (testeArea <= getAreaLateral() && testeArea >= movimentoMin) {
                coordenadaAnterior = getCoordenada();
                getCoordenada()[1] -= getMovimentacao();
                System.out.println(getCoordenada()[0] + "  " + getCoordenada()[1]);
                movimentosRestantes --;
                return true;
            } else {
                return false;
            }
        } else if (sentido == cardeais[3]) {
            testeArea = getCoordenada()[0] - getMovimentacao();
            if (testeArea <= getAreaLateral() && testeArea >= movimentoMin) {
                coordenadaAnterior = getCoordenada();
                getCoordenada()[0] -= getMovimentacao();
                System.out.println(getCoordenada()[0] + "  " + getCoordenada()[1]);
                movimentosRestantes --;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /**
     * Metodo responsavel por fazer o Robo girar
     * @param direcao indica par qual lado o Robo deve girar
     * @return o resultado da rotacao
     */
    public String girarRobo(String direcao) {

        int i = 0;
        for (i = 0; i < 5; i++) {
            if (cardeais[i] == getOrientacao()) {

                if (direcao == "D") {
                    if (cardeais[i] == cardeais[3]) {
                        i = 0;
                        System.out.println("Girando o robo para direita em 3.2.1.0 apontando para: " + cardeais[i]);
                        setOrientacao(cardeais[i]);
                    } else {
                        System.out.println("Girando o robo para direita em 3.2.1.0 apontando para: " + cardeais[i + 1]);
                        setOrientacao(cardeais[i + 1]);
                    }
                } else if (direcao == "E") {
                    if (cardeais[i] == cardeais[0]) {
                        i = 3;
                        System.out.println("Girando o robo para esquerda em 3.2.1.0 apontando para: " + cardeais[i]);
                        setOrientacao(cardeais[i]);
                    } else {
                        System.out.println("Girando o robo para esquerda em 3.2.1.0 apontando para: " + cardeais[i - 1]);
                        setOrientacao(cardeais[i - 1]);
                    }
                }
                break;
            }
        }
        return getOrientacao();
    }

    /**
     * Metodo responsavel por retornar o nome do Robo
     * @return retorna o nome do Robo
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Metodo para retornar a lateral da area a ser explorada
     * @return retorna a largura ou altura
     */

    public int getArea() {
        return area;
    }

    /**
     * Metodo para definir a largura/altura e a area
     * @param area aponta a largura/altura da area
     */

    public void setArea(int area) {
        this.area = area * area;
        this.areaLateral = area;
    }

    /**
     * Metodo para retornar a largura/ altura
     * @return a largura ou altura
     */
    public int getAreaLateral() {
        return areaLateral;
    }

    /**
     * Metodo para retornar as coordenadas (x,y)
     * @return a localizacao do Robo
     */

    public int[] getCoordenada() {
        return coordenada;
    }


    /**
     * Metodo para definir se a coordenada inicial esta dentro da area definida
     * @param coordenada aponta as coordenadas (x,y)
     */
    public void setCoordenada(int[] coordenada) {


        if (coordenada[0] > getAreaLateral() || coordenada[1] > getAreaLateral()) {

            Random random = new Random();
            int numero = random.nextInt(getAreaLateral());
            this.coordenada = new int[]{numero, numero};

            setOrientacao("Norte");
        } else {
            this.coordenada = coordenada;

        }
    }

    /**
     * Metodo para retornar em qual sentido o Robo esta apontado
     * @return o ponto cardeal
     */
    public String getOrientacao() {

        return orientacao;
    }

    /**
     * Metodo para definir para onde o Robo aponta
     * @param orientacao inica a posicao cardeal
     */

    public void setOrientacao(String orientacao) {
        this.orientacao = orientacao;
    }

    /**
     * Metodo para retornar quantos movimentos ainda restam
     * @return a quantidade de movimentos
     */
    public int getMovimentosRestantes() {
        return movimentosRestantes;
    }

    /**
     * Metodo para definir com quantos movimentos o Robo inicia
     * @param movimentacao inidica quantas unidades o Robo anda
     * @return quantos moviemntos o Robo ainda pode realizar
     */
    public int setMovimentosRestantes(int movimentacao){
        movimentosRestantes = movimentoMaximo/movimentacao;
        return movimentosRestantes;
    }

    /**
     * Metodo para retornar qual a movimentacao do Robo
     * @return a movimentacao do Robo
     */
    public int getMovimentacao() {
        return movimentacao;
    }

    /**
     * Metodo para retornar a movimentacao maxima do Robo
     * @return a movimetacao do Robo
     */

    public int getMovimentoMaximo() {
        return movimentoMaximo;
    }

    /**
     * Metodo para definir o movimento maximo conforme definido na criacao e se esta dentro do aceito
     * @param movimentoMaximo indica a movimentacao maxima
     * @return quantos movimentos tem o Robo
     */

    public int setMovimentoMaximo(int movimentoMaximo) {

        if (movimentoMaximo <= movimentoMax && movimentoMaximo >= movimentoMin) {
            this.movimentoMaximo = movimentoMaximo;
            this.movimentosRestantes = this.movimentoMaximo / getMovimentacao();
        } else if (movimentoMaximo >= movimentoMin) {
            this.movimentoMaximo = movimentoMax;
            this.movimentosRestantes = this.movimentoMaximo / getMovimentacao();
        } else {
            System.out.println("Valor de movimentoMax incoerente");
        }
        return movimentoMaximo;
    }
}
