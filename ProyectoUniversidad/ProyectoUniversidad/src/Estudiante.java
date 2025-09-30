// Subclase abstracta que hereda de Universitario
public abstract class Estudiante extends Universitario {
    protected String carrera;

    public Estudiante(String nombre, String idUniversitario, String email, String carrera) {
        super(nombre, idUniversitario, email);
        this.carrera = carrera;
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("Actividad Principal: Estudiando para la carrera de " + this.carrera + ".");
    }

}