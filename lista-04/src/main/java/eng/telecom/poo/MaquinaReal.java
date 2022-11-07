package eng.telecom.poo;

import java.util.ArrayList;
public class MaquinaReal {
    private String nomeMaquinaReal;
    private int totalRamReal;
    private int totalDiscoRigidoReal;
    private static ArrayList<MaquinaVirtual> maquinaVirtual;
    private int quantidadeVirtual;
    private int totalMaquinaVirtual = 5;

    public MaquinaReal(String nomeMaquinaReal, int totalRamReal, int totalDiscoRigidoReal, int quantidadeVirtual){

            this.nomeMaquinaReal = nomeMaquinaReal;
            this.totalRamReal = totalRamReal;
            this.totalDiscoRigidoReal = totalDiscoRigidoReal;
            this.quantidadeVirtual = quantidadeVirtual;
            this.maquinaVirtual = new ArrayList<>();
    }
    public boolean adicionaMaquinaVirtual(String nomeMaquinaVirtual, int totalRamVirtual, int totalDiscoRigidoVirtual) {
        if (getQuantidadeVirtual() < totalMaquinaVirtual) {

            if ((getTotalRamReal() >= totalRamVirtual) && (getTotalDiscoRigidoReal() >= totalDiscoRigidoVirtual)) {
                quantidadeVirtual++;

                MaquinaReal.maquinaVirtual.add(new MaquinaVirtual(nomeMaquinaVirtual, totalRamVirtual, totalDiscoRigidoVirtual));

                System.out.println(nomeMaquinaVirtual + " esta ligada!");

                setTotalRamReal(totalRamVirtual);
                setTotalDiscoRigidoReal(totalDiscoRigidoVirtual);
                return true;
            }

        }
        else{
            System.out.println("erro maquina virtual");
        }
        return false;
    }

    public boolean removeMaquinaVirtual(String nomeMaquinaVirtual){

       for(int i = 0; i < maquinaVirtual.size(); i++) {
            if(nomeMaquinaVirtual == maquinaVirtual.get(i).getNomeMaquinaVirtual()) {

                this.totalRamReal += maquinaVirtual.get(i).getTotalRamVirtual();
                this.totalDiscoRigidoReal += maquinaVirtual.get(i).getTotalDiscoRigidoVirtual();

                MaquinaReal.maquinaVirtual.remove(maquinaVirtual.get(i));
                System.out.println(nomeMaquinaVirtual + " esta desligada!");
                quantidadeVirtual --;
                return true;

            }
        }
        return false;
    }
    public String getNomeMaquinaReal() {
        return nomeMaquinaReal;
    }

    public int getTotalRamReal() {
        return totalRamReal;
    }
    public ArrayList<MaquinaVirtual> getMaquinaVirtual() {
        return maquinaVirtual;
    }

    public void setTotalRamReal(int ramVirtual) {
        this.totalRamReal -= ramVirtual;
    }
    public int getTotalDiscoRigidoReal() {
        return totalDiscoRigidoReal;
    }

    public void setTotalDiscoRigidoReal(int discoRigidoVirtual) {
        this.totalDiscoRigidoReal -= discoRigidoVirtual;
    }

    public int getQuantidadeVirtual() {
        return quantidadeVirtual;
    }

    public void setQuantidadeVirtual(int quantidadeVirtual) {
        this.quantidadeVirtual = quantidadeVirtual;
    }
}
