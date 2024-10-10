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
        System.out.println(libro1.imprimir_cubierta());
        libro2.imprimir();
        System.out.println(libro2.imprimir_cubierta());
        libro3.imprimir();
        System.out.println(libro3.imprimir_cubierta());
        libro4.imprimir();
        System.out.println(libro4.imprimir_cubierta());

        //Series
        Serie serie1=new Serie("Malcolm in the middle",151,"Linwood Boomer",8);
        Serie serie2=new Serie("Perdidos",121, "J.J Abrams",8);

        //Videojuegos
        Videojuego videojuego1=new Videojuego("Alien Isolation","Terror",2014,9);
        Videojuego videojuego2=new Videojuego("Fornite","Battle Royale",2017,8);


        }
    }


