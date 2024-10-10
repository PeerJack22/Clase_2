public class Cancion {

    //atributos
    String nombre;
    String autor;
    String genero;

    //metodos
        //Constructor
    public Cancion(String nombre, String autor, String genero) {
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
    }

    //setters y getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
