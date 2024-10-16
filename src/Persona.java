public class Persona {

    //atributos
    String nombre;
    int edad;
    float altura;
    float peso;

    //Metodo
        //Constructor

    public Persona(String nombre, int edad, float altura, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public void imprimir_persona (){
        System.out.println("------------------------------------");
        System.out.println("Nombre: " +this.nombre);
        System.out.println("Edad: " +this.edad);
        System.out.println("Altura: " +this.altura);
        System.out.println("Peso: " +this.peso);
        System.out.println("------------------------------------");
        System.out.println();
    }

    //Setters y Getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
