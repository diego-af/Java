import java.util.Scanner;

public class loops{
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        int candidato=0;int candidato1=0;int candidato2=0;int candidato3=0;
        int qtd=0;int idade=0;
        



        do{
            System.out.println("Escolha seu candidato\n 1-Bolsonaro \n 2-Lula\n 3- Ciro Gomes");
            candidato = read.nextInt();
            System.out.println("Digite sua idade: ");
            idade = read.nextInt();
            read.close();


            if(candidato != 1 || candidato !=2 || candidato !=3){
                System.out.println("Fim do Programa, numero não esperado");
                System.exit(0);
            }else if(idade <16){
                System.out.println("Não se pode votar 😊");
            }else{
                switch(candidato){
                    case 1:
                        candidato1++; 
                        break;  
                    case 2:
                        candidato2++;
                        break;
                    case 3:
                        candidato3++;
                        break;
                    default:
                        System.out.println("NInguem foi votado 😒");

                }
            }
            qtd++;
        }while(qtd<3);
        System.out.println("Fim do programa");
    }
}