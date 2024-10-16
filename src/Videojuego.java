public class Videojuego {
    //Atributos
    String nombre;
    String genero;
    int anio;
    int calificacion;

    //Métodos
        //Constructor
    public Videojuego(String nombre, String genero, int anio, int calificacion) {
        this.nombre = nombre;
        this.genero = genero;
        this.anio = anio;
        this.calificacion = calificacion;
    }

    public Videojuego() {}

    public void imprimir_videojuego() {
        System.out.println("------------------------------------");
        System.out.println("Nombre: " +this.nombre);
        System.out.println("Género: " +this.genero);
        System.out.println("Año: " +this.anio);
        System.out.println("Calificación: " +this.calificacion);
        System.out.println("------------------------------------");
        System.out.println();
    }

    //getters

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnio() {
        return anio;
    }

    public int getCalificacion() {
        return calificacion;
    }

    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

}
