package Operacion;

import java.util.Scanner;

public class Operacion {

    Scanner leer = new Scanner(System.in);
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        System.out.println("Ingresar 2 números distintos.");
        System.out.print("Número 1 = ");
        setNumero1(leer.nextInt());
        if (getNumero1() == 0) {
            do {
                System.out.println("NO INGRESAR EL NÚMERO 0.");
                System.out.print("Nuevo número 1 = ");
                setNumero1(leer.nextInt());
            } while (getNumero1() == 0);
        }
        System.out.print("Número 2 = ");
        setNumero2(leer.nextInt());
        if (getNumero2() == 0) {
            do {
                System.out.println("NO INGRESAR EL NÚMERO 0.");
                System.out.print("Nuevo número 2 = ");
                setNumero2(leer.nextInt());
            } while (getNumero2() == 0);
        }
    }

    public int suma() {
        return (getNumero1() + getNumero2());
    }

    public int resta() {
        return (getNumero1() - getNumero2());
    }

    public int multiplicacion() {
        if (getNumero1() == 0 || getNumero2() == 0) {
            System.out.println("No múltiplicar X 0.");
            return 0;
        } else {
            return (getNumero1() * getNumero2());
        }
    }

    public double division() {
        if (getNumero1() == 0 || getNumero2() == 0) {
            System.out.println("No dividir X 0.");
            return 0;
        } else {
            return (double) getNumero1() / getNumero2();
        }
    }

    public void mostrar() {
        System.out.println(" -Suma " + getNumero1() + " + " + getNumero2() + " = " + suma());
        System.out.println(" -Resta " + getNumero1() + " - " + getNumero2() + " = " + resta());
        System.out.println(" -Multiplicación " + getNumero1() + "X" + getNumero2() + " = " + multiplicacion());
        System.out.println(" -División " + getNumero1() + "/" + getNumero2() + " = " + division());

    }
}
