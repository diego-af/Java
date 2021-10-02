public class Filho extends Herdeiro {
    
    private String filiacao;
    private boolean herdado;
    private boolean morteDad;
    private final String SIM = "Sim";
    private final String NAO = "NAO";

    public Filho(String nome,int idade,String filiacao){
        super(nome,idade);
        this.herdado = true;
        this.morteDad =false;
        this.filiacao = filiacao;

    }


    public String getfiliacao(){
        return this.filiacao;
    }
    public void setFiliacao(String nome){
        this.filiacao = nome;
    }

    public boolean getHerdado(){
        return this.herdado;
    }
    public void setHerdado(){
        if(super.getHerdando()){
            this.herdado = true;
        }
    }
    public boolean getMorteDad(){
        return this.morteDad;
    }

    public void setMorteDad(){
        this.morteDad = super.getMorte();
    }

    public void discribe(Herdeiro herdeiro){
        super.discribe();
        System.out.printf("\n Status do Herdeiro é %s ",(this.morteDad) ? SIM: NAO);
        System.out.printf("\n Filiacao é %s ",herdeiro.getNome());
    }
}
