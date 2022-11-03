package arreglos;

public class Random {

    public static void main(String[] args) {
        int arre [] = new int[10];
        int a=1;
        
        for (int i = 0; i < arre.length; i++) {
            arre[i] = (int) (Math.random()*100) + 1 ;
            System.out.println((i+1)+".- "+arre[i]);
        }
        System.out.println("---------------------------");
        for (int i = 0; i < arre.length; i++) {
            if (arre[i] > 50) {
                System.out.println((a)+".- "+arre[i]);
                a++;
            }
        }
    }
}