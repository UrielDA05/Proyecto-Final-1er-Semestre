package programasPrimero;
public class Arbol {
    public void dibujar() {
        int altura = 10;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= altura / 2; i++) {
            for (int j = 1; j <= altura - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("***");
        }
    }
}
    
    

