import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Classe {
    public static void main(String[] args){


        Animal animal = new Animal(" ", "");
        

        

        animal.nome= JOptionPane.showInputDialog(null,"Digite o nome do cachrro ");
        animal.raca = JOptionPane.showInputDialog(null,"Digite o nome da raca ");

        //animal.latir();
        //animal.controlVaccine();
        animal.inserirVacina(false);
        animal.controlVaccine();
    }
}
