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

}
