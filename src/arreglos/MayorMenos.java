package arreglos;

public class MayorMenos {

    public static void main(String[] args) {
        int arre[] = {1, 0, 60, -3, 0, 5, -5, 12, 23, -8, -1, 0};
        
        int b=0;
        for (int i = 0; i < arre.length; i++) {
            if (arre[i] <= 0) {                
                System.out.println("En la posicion "+b);
                System.out.println("- "+arre[i]);
            }
            b++;
        }
    }
}