public class Herdeiro {
    private String nome;
    private int idade=0;
    private boolean herdando = false;
    private final String SIM = "Sim";
    private final String NAO = "NAO";
    private boolean morte = false;



    public Herdeiro(String nome,int idade){
        this.nome = nome;
        this.idade = idade;
    }



    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        if(this.idade>=18){
           return this.idade;
        }else{
            return 0;
        }
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public boolean getHerdando(){
        return this.herdando;
    }
    public void setHerdando(boolean herdando){
        this.herdando = herdando;
    }

    public boolean getMorte(){
        return this.morte;
    }
    public void setMorte(boolean morte){
        this.morte = morte;
    }

    public void discribe(){
        System.out.println("\n -------------------------");
        System.out.println("\n DESCREVENDO O HERDEIRO ");
        System.out.printf("\n Nome do Herdeiro é %s ", this.nome);
        System.out.printf("\n Idade do Herdeiro é %d ", this.idade);
        System.out.printf("\n Status do Herdeiro é %s ",(this.herdando) ? SIM : NAO);

    }
}
