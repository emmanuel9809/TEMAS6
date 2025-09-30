public class EstudianteMatriculado extends Estudiante {
    private int semestre;

    public EstudianteMatriculado(String nombre, String idUniversitario, String email, String carrera, int semestre) {
        super(nombre, idUniversitario, email, carrera);
        this.semestre = semestre;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("--- Estudiante Matriculado ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("ID: " + this.idUniversitario);
        System.out.println("Carrera: " + this.carrera);
        System.out.println("Semestre: " + this.semestre);
    }
}