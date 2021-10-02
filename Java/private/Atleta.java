public class Atleta {
    

    public int num =0;
    private int vidas = 0;
   


    public Atleta(int num){
        this.num = num;
        this.vidas = 3;
        System.out.printf("Jogador numero %d criado com %d vidas\n",num,vidas);
        num++;
        
    }

}
