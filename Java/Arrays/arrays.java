
import java.util.Scanner;
public class arrays {
    public static void main(String[] ars){
        

        Scanner ready =new Scanner(System.in);
        String[] pessoas= {"Diego", "Jessica","Diana","Bruna"};
        int chances=3;
        String nome="";
        int nota=0;
        String name="Diego";

        if(pessoas[0] == nome){
            name=pessoas[0];
            nota++;
           
        }
       
        System.out.printf("Sua nota de acerto %d, e você acertou o nome de %s",nota,name);
    }
}
