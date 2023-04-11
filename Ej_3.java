
import Operacion.Operacion;

/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2.
A continuación, se deben crear los siguientes métodos:
A)Método constructor con todos los atributos pasados por parámetro.
B)Método constructor sin los atributos pasados por parámetro.
C)Métodos get y set.
D)Método para crearOperacion(): que le pide al usuario los dos números y
   los guarda en los atributos del objeto.
E)Método sumar(): calcular la suma de los números y devolver el resultado al main.
F)Método restar(): calcular la resta de los números y devolver el resultado al main
G)Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a
   multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
   Si no, se hace la multiplicación y se devuelve el resultado al main
H)Método dividir(): primero valida que no se haga una división por cero, si fuera a
   pasar una división por cero, el método devuelve 0 y se le informa al usuario 
   el error se le informa al usuario.Si no, se hace la división y se devuelve el resultado al main.
*/
public class Ej_3 {

    public static void main(String[] args) {
        Operacion N = new Operacion();
        N.crearOperacion();
        N.mostrar();
    }
    
}
