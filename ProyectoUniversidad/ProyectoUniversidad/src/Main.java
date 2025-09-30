import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Universitario> comunidad = new ArrayList<>();

        comunidad.add(new EstudianteMatriculado("Ana López", "EST123", "ana@uni.edu", "Ing. en Sistemas", 3));
        comunidad.add(new Profesor("Dr. Carlos Ruiz", "EMP456", "carlos@uni.edu", 50000, "Ciencias de la Computación", "Inteligencia Artificial"));
        comunidad.add(new EstudianteADistancia("Juan Martinez", "EST789", "juan@uni.edu", "Derecho", "Plataforma Moodle"));
        comunidad.add(new DeBase("Sofia Hernandez", "EMP101", "sofia@uni.edu", 25000, "Servicios Escolares", "Administrativo"));

        for (Universitario miembro : comunidad) {
            miembro.mostrarDetalles();
            miembro.realizarActividadPrincipal();

            if (miembro instanceof Empleado) {
                Empleado emp = (Empleado) miembro;
                System.out.println("Bono Anual Calculado: $" + emp.calcularBonoAnual());
            }

            System.out.println("\n=============================\n");
        }

    }



}