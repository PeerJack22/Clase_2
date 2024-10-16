public class Auto {
    //Atributos
    String marca;
    String color;
    float peso;

    //Métodos
        //Constructor

    public Auto(String marca, String color, float peso) {
        this.marca = marca;
        this.color = color;
        this.peso = peso;
    }

    //Imprimir
    public void mostrar_auto(){
        System.out.println("------------------------------------");
        System.out.println("Marca: " +this.marca);
        System.out.println("Color: " +this.color);
        System.out.println("Peso: " +this.peso);
        System.out.println("------------------------------------");
        System.out.println();
    }

    //Getters and setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
