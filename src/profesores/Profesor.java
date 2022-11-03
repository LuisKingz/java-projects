package profesores;

public abstract class Profesor {
    private String nomCompleto;
    private String nomMateria;
    private String titulo;
    private int horas;
    private double sueldoBase;

    public Profesor(String nomCompleto, String nomMateria, String titulo, double sueldoBase) {
        this.nomCompleto = nomCompleto;
        this.nomMateria = nomMateria;
        this.titulo = titulo;
        this.sueldoBase = sueldoBase;
    }

    public Profesor(String nomCompleto, String nomMateria, String titulo, int horas, double sueldoBase) {
        this.nomCompleto = nomCompleto;
        this.nomMateria = nomMateria;
        this.titulo = titulo;
        this.horas = horas;
        this.sueldoBase = sueldoBase;
    }
    

    public Profesor() {
    }

    public String getNomCompleto() {
        return nomCompleto;
    }

    public void setNomCompleto(String nomCompleto) {
        this.nomCompleto = nomCompleto;
    }

    public String getNomMateria() {
        return nomMateria;
    }

    public void setNomMateria(String nomMateria) {
        this.nomMateria = nomMateria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    
    abstract void muestraDatos();

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
}
