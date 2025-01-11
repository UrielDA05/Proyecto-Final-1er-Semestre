package programasPrimero;

import javax.swing.JOptionPane;

public class Area_Volumen {
    public void calcular (){
        short h = 0;
        short r = 0;
        h=Short.parseShort(JOptionPane.showInputDialog("Ingresa el valor de la altura"));
        r=Short.parseShort(JOptionPane.showInputDialog("Ingresa el valor del radio de la base"));
        double a;
        double v;
        v =Math.PI*(r*r)*(h);
        a =Math.PI*2*(r)*(h)+Math.PI*2*(r*r);  
        JOptionPane.showMessageDialog(null, " El volumen del cilindro es: " +v +"cm3");
        JOptionPane.showMessageDialog(null, " El area del cilindro es: " +a +"cm2");
    }
    
    
            
    
}
