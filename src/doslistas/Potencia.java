package doslistas;

public class Potencia {

    public int calcularPotencia(int po, int num) {
        if (num == 0) {
            return 1;
        }
        return po * calcularPotencia(po, num - 1);
    }
}
