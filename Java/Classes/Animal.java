import javax.swing.JOptionPane;

public class Animal {
    
   public String nome="";
   public String raca="";
    public static boolean vacinado;


    public Animal(String nome, String raca){
        
        this.nome = nome;
        this.raca = raca;
        
    }

    public void latir(){
        System.out.printf("O cachorro %s da raça %s latiu\n ",nome,raca);
    }

    public void controlVaccine(){
        boolean yes=false;
        yes = verifyVaccine(vacinado);

        if(yes){
            //System.out.println("O cachorro " + nome + "da raca " + raca + " esta vacinado");
            JOptionPane.showMessageDialog(null, "O cachorro da raca "+ raca+ " com nome "+ nome+ " Foi vacinado");
        }else{
            JOptionPane.showMessageDialog(null, "O cachorro da raca "+ raca+ " com nome "+ nome+ " Não Foi vacinado ");
            //System.out.println("O cachorro " + nome + "da raca " + raca + " não esta vacinado,procure o veterinario");
        }
    }
    private boolean verifyVaccine(boolean vaccine){
        vaccine = inserirVacina(vacinado);
        this.vacinado = vaccine;

        return this.vacinado;
    }
    public boolean inserirVacina(boolean vaci){
             boolean vac = vaci;
            return vac;
    }

} 
