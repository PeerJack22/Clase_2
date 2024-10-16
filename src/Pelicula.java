public class Pelicula {
    String titulo;
    int anio;
    String genero;

    //metodos
        //Constructor

    public Pelicula(String titulo, String genero, int anio) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
    }

    //Imprimir
    public void mostrar_Pelicula() {
        System.out.println("------------------------------------");
        System.out.println("Titulo: " +this.titulo);
        System.out.println("Género: " +this.genero);
        System.out.println("Año: " +this.anio);
        System.out.println("------------------------------------");
        System.out.println();
    }

    //Setters y Getters

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
