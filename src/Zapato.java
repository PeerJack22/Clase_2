public class Zapato {
    String marca;
    String color;
    int talla;

    //Constructor

    public Zapato(String marca, int talla, String color) {
        this.marca = marca;
        this.talla = talla;
        this.color = color;
    }

    //Setters y Getters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

}
