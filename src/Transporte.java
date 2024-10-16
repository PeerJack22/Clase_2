public class Transporte {

    //Atributos
    String tipo;
    int capacidad_de_personas;
    String color;

    //metodos
        //Constructor

    public Transporte(int capacidad_de_personas, String tipo, String color) {
        this.capacidad_de_personas = capacidad_de_personas;
        this.tipo = tipo;
        this.color = color;
    }

    //setters y getters


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad_de_personas() {
        return capacidad_de_personas;
    }

    public void setCapacidad_de_personas(int capacidad_de_personas) {
        this.capacidad_de_personas = capacidad_de_personas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
