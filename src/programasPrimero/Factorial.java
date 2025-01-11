package programasPrimero;
import javax.swing.JOptionPane;

public class Factorial {
    public void estimar() {
        int fact=1,x,resp,num;
        do{
        num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a calcular el factorial"));
        fact=1;
        for(x=num; x>=1; x--){
        fact*=x;
        }
        JOptionPane.showMessageDialog(null,"El factorial de "+ num + " es: "+fact);
            resp=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 para calcular otro factorial"));
        }while (resp==1);
    }
    
}
