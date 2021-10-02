import javax.swing.JOptionPane;

public class Exercicio {
    public static void main(String[] args){
        int[] numeros = {1,2,3,4,5};
        System.out.println(contarLetras("Paralelepipedo"));
        System.out.println(contaNumeros(numeros));
        

    }
    public static int contarLetras(String palavras){
        int quantiadade=0;
        palavras = palavras.toUpperCase();

        for(int a= 0; a < palavras.length(); a++){
                if(palavras.charAt(a) == 'A'){
                    quantiadade++;
                }
        }
        return quantiadade;
    }
    public static int contaNumeros(int[] numeros){
        int quantidade=0;
        int res=0;

        for(int i = 0; i <numeros.length; i++){
            quantidade++;
            numeros[i]= i*3;
            res=numeros[i];
        }   
        return res;
    }
   
}
