package Tratamentos;

import javax.swing.JOptionPane;


public class index {
    
    public static void main(String[]args){

        float temperatura = Float.parseFloat(JOptionPane.showInputDialog( "Digite aqui sua temperatura"));
       
       


        if(temperatura > 35.0){
              JOptionPane.showMessageDialog(null, "Bem vindo, sua temperatura é " + temperatura);
            
        }else if(temperatura < 35.0){
            JOptionPane.showMessageDialog(null, "Precisa ser internado ");
        }

        

    }
}
