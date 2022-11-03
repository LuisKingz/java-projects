
package profesores;


import java.util.ArrayList;
import java.util.List;

public class Profesores {

    
    public static void main(String[] args) {
        List<Profesor> prof = new ArrayList<>();
        prof.add(new Horario("David", "Mate", "Inge", 5, 100));
        prof.add(new Completo("Luis", "progra", "doc", 250));
        
        for (Profesor profesor : prof) {
            profesor.muestraDatos();
        }
    }
}
