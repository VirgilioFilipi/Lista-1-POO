package eng.telecom.poo;

import java.util.ArrayList;
public class Rack {
    private String nomeRack;
    private static ArrayList<MaquinaReal> maquinaReal;
    private int quantidadeReal;
    private int totalMaquinaReal = 5;
    private int quantidadeMaquinaVirtual;

    public Rack(String nomeRack){

        this.nomeRack = nomeRack;
        this.maquinaReal = new ArrayList<>();
    }
    public boolean adicionaMaquinaReal(String nomeMaquinaReal, int totalRamReal, int totalDiscoRigidoReal){
        if(getQuantidadeReal() < totalMaquinaReal) {
            quantidadeReal++;
            Rack.maquinaReal.add(new MaquinaReal(nomeMaquinaReal, totalRamReal, totalDiscoRigidoReal, quantidadeMaquinaVirtual));
        return true;
        }
        else {
            System.out.println("Erro maquina real");
        }
        return false;
    }
    public String getNomeRack() {
        return nomeRack;
    }

    public ArrayList<MaquinaReal> getMaquinaReal() {
        return maquinaReal;
    }

    public int getQuantidadeReal() {
        return quantidadeReal;
    }
}
