public class Serie {
    //Atributos
    String nombre;
    int n_episodios;
    String director;
    int calificacion;

    //métodos
        //Constructor
    public Serie(String nombre, int n_episodios, String director, int calificacion) {
        this.nombre = nombre;
        this.n_episodios = n_episodios;
        this.director = director;
        this.calificacion = calificacion;
    }

    public void imprimirseries() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de episodios: " + n_episodios);
        System.out.println("Director: " + director);
        System.out.println("Calificacion: " + calificacion);
    }
}
