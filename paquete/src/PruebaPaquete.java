import modelos.Persona;

public class PruebaPaquete {

    public static void main(String[] args) {
        System.out.println("Creando un objeto desde una clase en otro paquete en la clase de Temas 6");


        Persona persona1 = new Persona("Yaaron Emmanuel Sanchez", 22);

        persona1.saludar();
    }
}
