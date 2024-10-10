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

    public void imprimirvideojuego() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Genero: " + genero);
        System.out.println("Año: " + anio);
        System.out.println("Calificacion: " + calificacion);
    }
}
