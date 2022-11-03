package cuadradodenumerorecursivo;

public class PotenciaArregloRecursivo {

    public static void main(String[] args) {
        int[] arr = new int[10];
        int cont = 0;
        for (int i = 1; i <= 10; i++) {
            arr[cont] = calcularPotencia(i, 2);
            System.out.print(arr[cont] + ", ");
            cont++;
        }
    }

    public static int calcularPotencia(int p, int n) {
        if (n == 0) {
            return 1;
        } else {
            return p * calcularPotencia(p, n - 1);
        }
    }
}
