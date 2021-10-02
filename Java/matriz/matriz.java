
import java.security.SecureRandom;
public class matriz {
    public static void main(String[] args){
       int linhas = 4;
       int colunas= 4;
       int [][] num={{20,50,30,100},{500,160,770,280},{1100,3110,2120,130},{140,1150,2160,170}};
   
        int[][] menor= new int[linhas][colunas];

       int[][] numeros= {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};

       for(int i =0; i<linhas;i++){
           for(int j=0;j<colunas;j++){
               numeros[i][j] = num[i][j];
           }
       }
       for(int i =0; i<linhas;i++){
            for(int j=0;j<colunas;j++){
            if(numeros[i][j]<numeros[i][j]){
                menor[i][j]=numeros[i][j];
               System.out.printf("%2d |",menor[i][j]);
             }
        }
            System.out.println("\n");
    }



        

    }
}
