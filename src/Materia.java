public class Materia {
    String nombre;
    String descripcion;
    String color;

    //metodos
        //constructor

    public Materia(String nombre, String color, String descripcion) {
        this.nombre = nombre;
        this.color = color;
        this.descripcion = descripcion;
    }

    //Setters y Getters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
