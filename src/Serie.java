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

    public Serie(){}

    public void imprimir_series(){
        System.out.println("------------------------------------");
        System.out.println("Nombre: " +this.nombre);
        System.out.println("Número de episodios: " +this.n_episodios);
        System.out.println("Director: " +this.director);
        System.out.println("Calificacion: " +this.calificacion);
        System.out.println("------------------------------------");
        System.out.println();
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

    public int getCalificacion() {
        return calificacion;
    }

    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setN_episodios(int n_episodios) {
        this.n_episodios = n_episodios;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }


}
