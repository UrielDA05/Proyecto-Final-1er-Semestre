package programasPrimero;
public class TablasMultiplicar {
    public void mostrar() {
        int num = 10;
        for(int a=1; a<=num;a++){
            System.out.printf(("Tabla del : "+ a + "\t" ));
        }    
        System.out.println("");
        for (int y = 1; y <= num; y++) {
            for (int x = 1; x <= num; x++) {
                System.out.printf(x + " x " + y + " = " + (x * y) + "\t");
            }
            System.out.println();
        }
    }      
}
