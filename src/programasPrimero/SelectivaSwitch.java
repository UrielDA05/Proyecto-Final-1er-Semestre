package programasPrimero;
import javax.swing.JOptionPane;
public class SelectivaSwitch {
    public void valorar() {
        // declaracion de variables
        byte opcion;
        float b,h,r;
        double a;
        final double PI=3.1416;
        opcion=Byte.parseByte(JOptionPane.showInputDialog("MENU DE OPCIONES\n 1.- Triangulo\n 2.- Rectangulo\n 3.- Circulo\n"
                +"Escribe el numero de tu eleccion"));
        switch (opcion){
            case 1:
                b=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la medida de la base"));
                h=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la medida de la altura"));
                a=(b*h)/2;
                JOptionPane.showMessageDialog(null,"El area del triangulo es "+ a);
                   break;
            case 2:
                b=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la medida de la base"));
                h=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la medida de la altura"));
                a=b*h;
                JOptionPane.showMessageDialog(null,"El area del rectangulo es "+ a);    
                   break;
            case 3: 
                r=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la medida del radio"));
                a= PI*(r*r);
                JOptionPane.showMessageDialog(null,"El area del circulo es "+ a); 
                   break;
            default:
                JOptionPane.showMessageDialog(null, "Solo es posible seleccionar 1,2 o 3\n Intente nuevamente");
            
                
        }
        
    }
    
}
