import java.util.Random;


public class CampoMinado {
    public static void main(String[] args) {
        int tamanho = 9;
        int x,y,z;
        char[][] matriz = new char[tamanho][tamanho];
        z=0;        

        for (int c = 0; c < tamanho; ++c) {  
            if (z<9) {
            y=2; 
            }
            else if (z ==9) {
            y=1;
            }
            else{
                y = 0;
            }   

            for (int l = 0; l < tamanho; ++l){
                
                if((c == 8) && (z<10)){
                    matriz[l][c] = '*';                    
                    y--;
                    z++;                    
                    }
                
                else{              
                               
                x = new Random().nextInt(6);
                
                if ((x == 0) && (y>0)){
                    
                    matriz[l][c] = '*';                    
                    y--;
                    z++;
                    
                    }
                
                else{

                matriz[l][c] = '.';
            }
        }
    }
        
    }
    
        for (int l = 0; l < tamanho; ++l) {
            for (int c = 0; c < tamanho; ++c)
                System.out.print(matriz[c][l] + " ");

            System.out.println();
        }  
    }
}
