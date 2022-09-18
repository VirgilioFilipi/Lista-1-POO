public class Ex_Media {
    public static void main(String[] args) {

        double P1, P2, L1, L2, L3, L4, L5;
        double MP, MG, CF;

        P1 = Double.parseDouble(args[0]);
        P2 = Double.parseDouble(args[1]);
        L1 = Double.parseDouble(args[2]);
        L2 = Double.parseDouble(args[3]);
        L3 = Double.parseDouble(args[4]);
        L4 = Double.parseDouble(args[5]);
        L5 = Double.parseDouble(args[6]);

        MP = ((P1*2) + (P2*4))/6;
        MG = (Double) Math.exp((Math.log(L1*L2*L3*L4*L5))/5);              
        CF = (MP*0.9) + (MG*0.1);
        System.out.println("*****"+MG);

        if (CF > 6){
            System.out.println("Aprovado, media: "+ CF);
        }
        else{
            System.out.println("Reprovado, media: "+ CF);
        }   
              
        }
    }
        
        


