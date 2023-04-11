package Libro;

import java.util.Scanner;

public class Libro {

    Scanner leer = new Scanner(System.in);
    public String isbn;
    public String titulo;
    public String autor;
    public int pags;

    public Libro() {
        int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, s;
        n1 = 9;
        n2 = 7;
        n3 = 8;
        n4 = (int) (Math.random() * 10);
        n5 = (int) (Math.random() * 10);
        n6 = (int) (Math.random() * 10);
        n7 = (int) (Math.random() * 10);
        n8 = (int) (Math.random() * 10);
        n9 = (int) (Math.random() * 10);
        n10 = (int) (Math.random() * 10);
        n11 = (int) (Math.random() * 10);
        n12 = (int) (Math.random() * 10);
        s = (n1*1) + (n2*3) + (n3*1) + (n4*3) + (n5*1) + (n6*3) + (n7*1) + (n8*3) + (n9*1) + (n10*3) + (n11*1) + (n12*3);
        if (s % 10 == 0) {
            s = 0;
        } else {
            do {
                s = s - 10;
            } while (s > 10);
        }
        s = 10 - s;
        isbn = n1 + "" + n2 + "" + n3 + "" + "-" + n4 + "" + n5 + "" + n6 + "" + "-" + n7 + "" + n8 + "" + n9 + "-" + n10 + "" + n11 + "" + n12 + "-" + s;
    }

    public Libro(String isbn, String titulo, String autor, int pags) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.pags = pags;
    }

    public void Cargar() {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.pags = pags;
    }

    public void Preguntas() {
        System.out.println("Ingrese los datos del libro.");
        System.out.println("1)Titulo.");
        System.out.println("2)Autor.");
        System.out.println("3)Páginas.");
        System.out.println("4)ISBN.");
        titulo = leer.nextLine();
        autor = leer.nextLine();
        pags = leer.nextInt();
    }

    public void Mostrar() {
        System.out.println("Titulo : " + titulo);
        System.out.println("Autor : " + autor);
        System.out.println("Páginas : " + pags);
        System.out.println("ISBN : " + isbn);
    }
}
