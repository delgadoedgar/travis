/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareatravis;
import javax.swing.*;

/**
 *
 * @author USUARIO
 */
public class Tareatravis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    { int op=0;
        double n1,n2,s,m,d,r;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("nCalculadoran"+
            "************n"+
            "[1] SUMARn"+
            "[2] RESTARn"+
            "[3] MULTIPLICARn"+
            "[4] DIVIDIRn"+
            "[5] SALIRn"+
            "Ingresa una opcion:"));

            switch(op)
            {
                case 1:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 2"));
                    s=n1+n2;
                    JOptionPane.showMessageDialog(null,"La suma es:"+s);
                    break;
              
            }
        }while(op!=5);
    }

}
