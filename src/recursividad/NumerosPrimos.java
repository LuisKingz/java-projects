package recursividad;

public class NumerosPrimos {
    static int acum = 0;

    public static boolean numPrim(int pos, int sum) {
        if (pos % sum == 0 && sum != pos) {
            return false;
        } else if (sum > pos / 2) {
            acum++;
            return true;
        } else {
            return numPrim(pos, sum + 1);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; acum < 10; i++) {
            if (numPrim(i, 2)) {
                System.out.println("--> "+i);
            }
        }
    }
}