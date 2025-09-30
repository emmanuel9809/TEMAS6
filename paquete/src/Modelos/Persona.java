// IntelliJ añade esta línea automáticamente.
// Declara que esta clase pertenece al paquete 'modelos'.
package modelos;

// La clase debe ser 'public' para poder ser usada desde fuera del paquete.
public class Persona {
    // Atributos
    private String nombre;
    private int edad;

    // Constructor para inicializar el objeto
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Un método para que el objeto haga algo
    public void saludar() {
        System.out.println("¡Hola! Mi nombre es " + this.nombre + " y tengo " + this.edad + " años.");
    }
}