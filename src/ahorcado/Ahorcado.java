/*
*Esta clase inicia el juego 
*Luis Fernando Acevedo Reyes
*14/02/2019 01:57:00
*/

package ahorcado;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

    /*
    *
    *
    *
    */
    public static void main(String[] args) {
        Imprimir imprimir = new Imprimir();
        Separar separar = new Separar();
        final int INTENTOS_TOTALES = 6;

        Scanner read = new Scanner(System.in);
        char resp;

        Random fraseAleatoria = new Random();

        String frases[] = {"jesus es vida", "el carro no sirve", "la casa bonita"};

        do {
            int intentos = 0, aciertos = 0;
            int ban = 1;

            int resultadoAleatorio = fraseAleatoria.nextInt(3);

            char[] frase = separar.separar(frases[resultadoAleatorio]);
            char[] fraseCopia = frase;
            char[] respuesta = new char[frase.length];

            for (int i = 0; i < respuesta.length; i++) {
                if (frase[i] == ' ') {
                    respuesta[i] = ' ';
                    aciertos++;
                   
                } else {
                    respuesta[i] = '*';
                }
            }

            System.out.println("[ A D I V I N A   L A   R E S P U E S T A]");

            while (intentos < INTENTOS_TOTALES && aciertos != respuesta.length) {
                imprimir.imprimirOculta(respuesta);
                System.out.println("");
                System.out.println("Introduce una letra: ");
                resp = read.next().toLowerCase().charAt(0);
                for (int i = 0; i < frase.length; i++) {
                    if (frase[i] == resp) {
                        respuesta[i] = frase[i];
                        aciertos++;
                        ban = 1;
                    }
                }
                if (ban == 0) {
                    intentos++;
                } 
                ban = 0;
            }
            ban = 0;
            if (aciertos == respuesta.length) {
                System.out.println("Ganaste: ");
                imprimir.imprimirOculta(respuesta);
            } else {
                System.out.println("Perdiste: ");
                System.out.print(Arrays.toString(fraseCopia));
            }
            System.out.println("Presiona cualquier tecla para jugar de nuevo o presiona 'n'para salir");
            resp = read.next().toLowerCase().charAt(0);
        } while (resp != 'n');
    }
}
