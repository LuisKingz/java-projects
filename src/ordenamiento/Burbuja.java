package ordenamiento;

import java.util.Arrays;

public class Burbuja {

    public static int [] ordear(int[] arre) {
        int a;
        for (int i = 0; i < arre.length; i++) {
            for (int j = 0; j < arre.length; j++) {
                if (arre[i] < arre[j]) {
                    a = arre[j];
                    arre[j] = arre[i];
                    arre[i] = a;
                }
            }
            System.out.println(Arrays.toString(arre));
        }
        return arre;
    }

    public static void main(String[] args) {

        int[] arre = {10, 4, 2, 3, 5, 9, 8, 7, 6, 1};
        
        ordear(arre);
    }
}
