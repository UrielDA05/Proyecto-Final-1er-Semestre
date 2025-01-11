/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author uriel
 */
public class Impar_Par {
    public static void main(String[] args) {
        short n;
        n=Short.parseShort(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        if (n%2==0){
            JOptionPane.showMessageDialog(null, n+" Es par");
        }else{
            JOptionPane.showMessageDialog(null, n+" Es impar");
        }
    
    }
}
