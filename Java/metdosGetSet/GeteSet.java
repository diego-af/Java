public class GeteSet{

    public static void main(String[] args){

        int cont=0;
        
        
        Jogado jogador = new Jogado(++cont);
        Jogado jogador1 = new Jogado(++cont);




       // System.out.printf("%n Numero de vidas do jogador é %d", jogador.getVidas());

    

      // 
       jogador1.die();
       jogador1.discribe();
       jogador1.die();
       jogador1.discribe();
       jogador1.die();
       jogador1.discribe();
       
       
        jogador.die();
        jogador.discribe();
        jogador.die();
        jogador.die();
        jogador.discribe();

       
    }
}