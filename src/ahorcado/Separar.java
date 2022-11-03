/*
 * Esta clase de encarga de separa las frases en un arreglo de caracteres
 * Luis Fernando Acevedo Reyes
 * 04/02/2019/ 01:58:00
 */
package ahorcado;

/**
 *
 * @author lfern
 */
public class Separar {
     public char[] separar(String palabraAlazar) {
        char[] letras;
        letras = new char[palabraAlazar.length()];
        for (int i = 0; i < palabraAlazar.length(); i++) {
            letras[i] = palabraAlazar.charAt(i);
        }
        return letras;
    }
}
