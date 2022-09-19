import java.util.Random;

public class CCampoMinado {


    public static void main(String[] args) {
        int tamanho = 9;
        int x,y,z;
        char[][] matriz = new char[tamanho][tamanho];
        int[][] matriz_bombas = new int[tamanho][tamanho];
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
        

        for (int l = 1; l < tamanho - 1; ++l) {
            for (int c = 1; c < tamanho - 1; ++c) {
                if ((matriz[c][l+1] == '*' ) && (l<8)){
                    matriz_bombas[l][c] = matriz_bombas[l][c] +1;

                }
                if ((matriz[c+1][l+1] == '*' ) && (l<8)){
                    matriz_bombas[l][c] = matriz_bombas[l][c] +1;

                }
                    
                if ((matriz[c+1][l] == '*' ) && (c<8)){
                    matriz_bombas[l][c] = matriz_bombas[l][c] +1;

                }
                    
                if ((matriz[c][l-1] == '*' ) && (l>1)){
                    matriz_bombas[l][c] = matriz_bombas[l][c] +1;

                }
                if ((matriz[c-1][l-1] == '*' ) && (l>1)){
                    matriz_bombas[l][c] = matriz_bombas[l][c] +1;

                }
                    
                if ((matriz[c-1][l] == '*' ) && (c>1)){
                    matriz_bombas[l][c] = matriz_bombas[l][c]+1;

                }
                else{
                    matriz_bombas[l][c] = 0;
                }
                   
            }
        }
        for (int l = 0; l < tamanho; ++l) {
            for (int c = 0; c < tamanho; ++c)
                System.out.print(matriz_bombas[c][l] + " ");

            System.out.println();
        } 
        
    }
}
