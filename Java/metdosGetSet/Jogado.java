public class Jogado {
    
        private int num=0;
    
        private int vidas=0;
    
    
        public Jogado(int num){
            this.num = num;
            this.vidas =3;
        }

        public void discribe(){
            System.out.printf("%n Numero do jogador é %d com %d vidas ", num,getVidas());
        }

        public int die(){
            this.vidas--;
            buscarVidas(this.vidas);

            return this.vidas;
        }
        public void buscarVidas(int vidas){
            if(vidas == 0){
                System.out.printf("%n Jogador chegou a 0 vidas");
                System.out.printf("Final de Jogo o jogador tem %d ",getVidas());
            }
           //System.out.printf("Jgador tem %d ",getvidas());

           
       
        }
    
        public int getVidas(){

            return this.vidas;
        }

        public void setVidas(int vidas){

            
            this.vidas = vidas;
        }
    
    
}
