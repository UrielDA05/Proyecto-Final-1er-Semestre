
package principal; // Importando que la clase programasa se guardara en ese paquete
import javax.swing.JOptionPane; // Importando una clase que alguien mas programo 
import programasPrimero.*; // *: todo, importa todas las clases

public class Menu {
    // Atributo
    protected int x;
    // Metodo principal
    public static void main(String[] args) {
        // Declaracion de variables
        byte seleccion;
        String nom;
        
        // Mostrar las opciones del menu
        JOptionPane.showMessageDialog(null,"1.- Solicita datos para calcular el area y volumen de un cilindro\n");
                                      
        seleccion = Byte.parseByte(JOptionPane.showInputDialog(null,"Ingresa el numero del programa a ejecutar"));
        
        switch(seleccion){
            case 1:
                Area_Volumen obj1 = new Area_Volumen();
                obj1.calcular();
                
                break;
            case 2:
                break;
            case 3:
                break;
            default:        
        } // cierra el switch
        nom = JOptionPane.showInputDialog("Ingresa tu nombre completo");
        // crear objeto
        Menu objeto = new Menu();
        // invocar al metodo con un objeto
        objeto.registroDatos(nom);
        // crear un objeto para la clase Ejemplo
        Ejemplo objeto1 = new Ejemplo();
        objeto1.saludo();
    } // cierra el metodo principal
    
    public void imprimirMensaje(){
        System.out.println("Estamos a punto de concluir su primer semestre"
                + " ya eres un programador");
    }
    
    public void registroDatos(String nombre){
        System.out.println("Bienvenido " + nombre);
        imprimirMensaje();
    }
    /* Segundo metodo SINTAXIS
    modificadorAcceso tipoRetorno identificador( lista de parametros){...}
Donde:
    -modificadorAcceso puede ser: publico, amigable,privado o protegido
    -tipoRetorno puede ser: byte, short, int, long, double,boolean, char(return)
    String(return) 
    void(Sin tipo de retorno)
    identificador8nombre del metodo): Inicia con minuscula, nomenclatura de camello, sin espacios, con _,
    -lista de parametros: tipoDato identificador, por cada uno de ellos.
    ejemplo: (byte x, byte y)*/
} // cierra la clase
