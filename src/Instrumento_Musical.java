public class Instrumento_Musical {
    String nombre;
    String tipo;
    String color;

    //metodos
        //Constructor

    public Instrumento_Musical(String nombre, String color, String tipo) {
        this.nombre = nombre;
        this.color = color;
        this.tipo = tipo;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
