package eng.telecom.poo;

public class testeRack {
    public static void main(String[] args) {
        Rack ss = new Rack("sss");

        System.out.println(ss.getNomeRack());

        ss.adicionaMaquinaReal("filipi",100,90);
        ss.adicionaMaquinaReal("Israel",200,200);


        ss.getMaquinaReal().get(1).adicionaMaquinaVirtual("1111",10,50);
        ss.getMaquinaReal().get(1).adicionaMaquinaVirtual("2222",10,50);
        ss.getMaquinaReal().get(1).adicionaMaquinaVirtual("3333",10,50);
        ss.getMaquinaReal().get(1).adicionaMaquinaVirtual("44444",10,50);



        ss.getMaquinaReal().get(0).adicionaMaquinaVirtual("5555",10,30);
        ss.getMaquinaReal().get(0).adicionaMaquinaVirtual("6666",10,20);
        ss.getMaquinaReal().get(0).adicionaMaquinaVirtual("teste",10,10);
        System.out.println("Tamanho: " + ss.getMaquinaReal().get(0).getTotalDiscoRigidoReal());

        ss.getMaquinaReal().get(0).removeMaquinaVirtual("teste");
        System.out.println("Tamanho: " + ss.getMaquinaReal().get(0).getTotalDiscoRigidoReal());



        System.out.println(ss.getMaquinaReal());
        System.out.println("Tamanho: " + ss.getMaquinaReal().size());
        System.out.println("Tamanho: " + ss.getMaquinaReal().get(0).getNomeMaquinaReal());
        System.out.println("Tamanho: " + ss.getMaquinaReal().get(0).getTotalDiscoRigidoReal());
        System.out.println("Tamanho: " + ss.getMaquinaReal().get(0).getTotalRamReal());
        System.out.println("Tamanho: " + ss.getMaquinaReal().get(1).getMaquinaVirtual().get(0).getNomeMaquinaVirtual());
        System.out.println("Tamanho: " + ss.getMaquinaReal().get(0).getMaquinaVirtual().get(1).getNomeMaquinaVirtual());
        System.out.println("Tamanho: " + ss.getMaquinaReal().get(1).getMaquinaVirtual().get(2).getNomeMaquinaVirtual());
        System.out.println("Tamanho: " + ss.getMaquinaReal().get(0).getMaquinaVirtual().get(5).getNomeMaquinaVirtual());
        System.out.println("Quantidade maquina virtual : " + ss.getMaquinaReal().get(0).getQuantidadeVirtual());
        System.out.println("Quantidade maquina virtual : " + ss.getMaquinaReal().get(1).getQuantidadeVirtual());
        System.out.println("Quantidade maquina Real : " + ss.getQuantidadeReal());
        System.out.println("Quantidade maquina Real : " + ss.getQuantidadeReal());





    }
}
