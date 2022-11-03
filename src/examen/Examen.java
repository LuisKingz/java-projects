package examen;

import java.util.ArrayList;
import java.util.List;
import examen.Cliente;
public class Examen {

    enum Cafe {
        AMERICANO(10), ESPRESSO(20), CAPUCCINNO(30), LATTE(40), MOCHA(50);
        
        private int precio;

        Cafe(int precio) {
            this.precio = precio;
        }

        public int getPrecio() {
            return precio;
        }

        public void setPrecio(int precio) {
            this.precio = precio;
        }
    }

    enum Huevo {
        CRUDO(10), FRITO(20), REVUELTO(30), ESTRELLADO(40), AHOGADO(50);
        
        private int precio;

        Huevo(int precio) {
            this.precio = precio;
        }

        public int getPrecio() {
            return precio;
        }

        public void setPrecio(int precio) {
            this.precio = precio;
        }
    }

    public static void main(String[] args) {
        List <Cliente> cliente = new ArrayList();
        
    }
}
