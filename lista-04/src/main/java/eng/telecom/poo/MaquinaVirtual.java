package eng.telecom.poo;

public class MaquinaVirtual {
    private String nomeMaquinaVirtual;
    private int totalRamVirtual;
    private int totalDiscoRigidoVirtual;

    public MaquinaVirtual(String nomeMaquinaVirtual, int totalRamVirtual, int totalDiscoRigidoVirtual) {

        this.nomeMaquinaVirtual = nomeMaquinaVirtual;
        this.totalRamVirtual = totalRamVirtual;
        this.totalDiscoRigidoVirtual = totalDiscoRigidoVirtual;
    }

    public String getNomeMaquinaVirtual() {
        return nomeMaquinaVirtual;
    }

    public int getTotalRamVirtual() {
        return totalRamVirtual;
    }

    public int getTotalDiscoRigidoVirtual() {
        return totalDiscoRigidoVirtual;
    }
}
