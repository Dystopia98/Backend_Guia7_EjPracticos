package Rectangulo;

import java.util.Scanner;

public class Rectangulo {

    Scanner leer = new Scanner(System.in);
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void Datos() {
        System.out.println("     Datos del triangulo.");
        System.out.println("mayores a 1.");
        do {
            System.out.print("Base = ");
            setBase(leer.nextInt());
        } while (getBase() <= 0);
        do {
            System.out.print("Altura = ");
            setAltura(leer.nextInt());
        } while (getAltura() <= 0);
        do {
            if (getBase() == getAltura() || getBase() <= 0 || getAltura() <= 0) {
                if (getBase() == getAltura()) {
                    System.out.println("   Que sean diferentes y mayores a 1...");
                    System.out.print(" Nueva base :");
                    setBase(leer.nextInt());
                    System.out.print(" Nueva altura :");
                    setAltura(leer.nextInt());
                }
                if (getBase() <= 0 || getAltura() <= 0) {
                    System.out.println(" mayores a 1 ...");
                    if (getBase() <= 0) {
                        System.out.print("Nueva base(mayor a 0):");
                        setBase(leer.nextInt());
                    }
                    if (getAltura() <= 0) {
                        System.out.print("Nueva altura(mayor a 0):");
                        setAltura(leer.nextInt());
                    }
                }
            }
        } while (getBase() == getAltura() || getBase() <= 0 || getAltura() <= 0);
    }

    public void AyP() {
        System.out.println("          ÁREA : " + Area());
        System.out.println("          PERIMETRO : " + Perimetro());
    }

    public int Area() {
        return getBase() * getAltura();
    }

    public int Perimetro() {
        return ((getBase() + getAltura()) * 2);
    }

    public void Figura() {
        System.out.println("            Figura : ");
        for (int i = 0; i < getAltura(); i++) {
            System.out.print("                    ");
            for (int j = 0; j < getBase(); j++) {
                if (j == 0 || i == 0 || j == getBase() - 1 || i == getAltura() - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
