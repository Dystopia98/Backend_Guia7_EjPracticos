
package Circunferencia;

import java.util.Scanner;

public class Circunferencia {
    Scanner leer = new Scanner(System.in);
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return (double)radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void crearCircunferencia(){
        System.out.println("Radio.");
        setRadio(leer.nextDouble());
    }
    public double Area(){
        return (double)((int)(Math.PI*Math.pow(getRadio(), 2)*100))/100;
    }
    public double Perimetro(){
        return (double)((int)((2*Math.PI*getRadio())*100))/100;
    }
    public void Mostrar(){
        System.out.println("Radio = "+getRadio());
        System.out.println("Área = "+Area());
        System.out.println("Perimetro = "+Perimetro());
    }
}
