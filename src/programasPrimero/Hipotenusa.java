package programasPrimero;
import javax.swing.JOptionPane;
public class Hipotenusa {
    public void encontrar (){
        short cat1= 0 ; 
        short cat2= 0 ;
        cat1=Short.parseShort(JOptionPane.showInputDialog("Ingrese el valor del primer cateto"));
        cat2=Short.parseShort(JOptionPane.showInputDialog("Ingrese el valor del segundo cateto"));
        double hip;
        hip=Math.sqrt(Math.pow(cat1,2)+Math.pow(cat2,2));
        JOptionPane.showMessageDialog(null, hip+" Es la medida de la hipotenusa");
        
        
    }
    
            
}
