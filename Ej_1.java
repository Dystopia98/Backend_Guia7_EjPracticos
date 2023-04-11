
import Libro.Libro;
import java.util.Scanner;

/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de
páginas, y un constructor con todos los atributos pasados por parámetro y un constructor vacío.
Crear un método para cargar un libro pidiendo los datos al usuario y luego informar
mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas
*/
public class Ej_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Libro L = new Libro();
        L.Preguntas(); 
        L.Cargar();
        L.Mostrar();
    }
    
}
