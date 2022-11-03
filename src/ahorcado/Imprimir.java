/*
 * Esta clase imprimir las letras de los aciertos
 * Luis Fernando Acevedo Reyes
 * 14/02/2019 01:58:00
 */
package ahorcado;

/**
 *
 * @author lfern
 */
public class Imprimir {
    // el método imprime las letras encintradas
    public void imprimirOculta(char[] tusRespuestas) {
        for (int i = 0; i < tusRespuestas.length; i++) {
            System.out.print(tusRespuestas[i] + " ");
        }
    }
}
