public class Heranca {
    public static void main(String[]args){
        Herdeiro herdeiro = new Herdeiro("Gil",18);

        Filho filho = new Filho("Joao", 21,herdeiro.getNome());


       // herdeiro.discribe();
       herdeiro.setHerdando(false);
       herdeiro.setMorte(true);

        filho.discribe();
    }
}
