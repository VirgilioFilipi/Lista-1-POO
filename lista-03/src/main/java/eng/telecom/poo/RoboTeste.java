package eng.telecom.poo;

public class RoboTeste {
    public static void main(String[] args) {
        Robo cc = new Robo("rdx", 15,  new int[]{5, 6,}, "Norte", 5,90,5 );

        System.out.println(cc.getIdentificador());
        System.out.println(cc.getArea());
        System.out.println(cc.getCoordenada()[0]);
        System.out.println(cc.getCoordenada()[1]);
        System.out.println(cc.getOrientacao());
        System.out.println(cc.getMovimentoMaximo());
        System.out.println(cc.getMovimentosRestantes());

        cc.retornoCoordenada();

        cc.girarRobo("E");
        cc.Deslocar();
        cc.retornoCoordenada();



    }
}
