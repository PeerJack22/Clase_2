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

    //getters
    public String getNombre() {
        return nombre;
    }

    public int getN_episodios() {
        return n_episodios;
    }

    public String getDirector() {
        return director;
    }

}
