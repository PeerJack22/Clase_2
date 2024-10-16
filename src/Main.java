/**
 * Hello World Application
 * Our first example
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!"); // display output
        //para declara el objeto
        //para instanciar una clase
        Libro libro1=new Libro("El Resplandor","Stephen King","De Bosillo",600);
        Libro libro2= new Libro("El Hobbit","J.R.R Tolkien","Booket",448);
        Libro libro3= new Libro("La niebla","Stephen King","De Bosillo",300);
        Libro libro4= new Libro("La divina comedia","Dante Alighieri","Alianza",1000);

        libro1.imprimir();
        //System.out.println(libro1.imprimir_cubierta());
        libro2.imprimir();
        //System.out.println(libro2.imprimir_cubierta());
        //libro3.imprimir();
        //System.out.println(libro3.imprimir_cubierta());
        //libro4.imprimir();
        //System.out.println(libro4.imprimir_cubierta());

        //Series
        Serie serie1=new Serie("Malcolm in the middle",151,"Linwood Boomer",9);
        Serie serie2=new Serie("Perdidos",121, "J.J Abrams",8);

        System.out.println("Series");
        serie1.imprimir_series();
        serie2.imprimir_series();

        //System.out.println(serie1.getCalificacion());
        //System.out.println(serie2.getCalificacion());
        //serie1.setCalificacion(9);
        //System.out.println(serie1.getCalificacion());

        //Videojuegos
        Videojuego videojuego1=new Videojuego("Alien Isolation","Terror",2014,9);
        Videojuego videojuego2=new Videojuego("Fornite","Battle Royale",2017,8);

        System.out.println("Videojuegos");
        videojuego1.imprimir_videojuego();
        videojuego2.imprimir_videojuego();

        //System.out.println(videojuego1.getNombre());
        //System.out.println(videojuego2.getNombre());

        //Persona
        Persona persona1 = new Persona("Paulo Cisneros", 22, 1.75f, 70.5f);
        Persona persona2 = new Persona("Chloe Moretz", 23, 1.62f, 60.0f);

        System.out.println("Personas");
        persona1.imprimir_persona();
        persona2.imprimir_persona();

        //Auto

        Auto auto1 = new Auto("Toyota", "Rojo", 1200.5f);
        Auto auto2 = new Auto("Ford", "Azul", 1400.0f);

        System.out.println("Autos");
        auto1.mostrar_auto();
        auto2.mostrar_auto();

        //Transporte

        Transporte transporte1 = new Transporte( 50,"Autobús","Blanco");
        Transporte transporte2 = new Transporte(200, "Barco","Azul");

        System.out.println("Transportes");
        transporte1.mostrar_transporte();
        transporte2.mostrar_transporte();

        //Materia

        Materia materia1 = new Materia("Madera", "Orgánica", "Marrón");
        Materia materia2 = new Materia("Agua", "Inorgánica", "Transparente");

        System.out.println("Tipos de materia");
        materia1.mostrarMateria();
        materia2.mostrarMateria();

        //Zapato

        Zapato zapato1 = new Zapato("Nike",  42,"Negro");
        Zapato zapato2 = new Zapato("Adidas", 38,"Blanco");

        System.out.println("Zapatos");
        zapato1.mostrar_zapato();
        zapato2.mostrar_zapato();

        //InstrumentoMusical

        Instrumento_Musical instrumento1 = new Instrumento_Musical("Guitarra", "Cuerda", "Marrón");
        Instrumento_Musical instrumento2 = new Instrumento_Musical("Trompeta", "Viento", "Dorado");

        System.out.println("Instrumentos");
        instrumento1.mostrar_instrumento();
        instrumento2.mostrar_instrumento();

        //Pelicula

        Pelicula pelicula1 = new Pelicula("El Señor de los Anillos: La Comunidad del Anillo","Fantasía",2001);
        Pelicula pelicula2 = new Pelicula("Avengers: Endgame",  "Acción",2019);

        System.out.println("Peliculas");
        pelicula1.mostrar_Pelicula();
        pelicula2.mostrar_Pelicula();

    }
    }


