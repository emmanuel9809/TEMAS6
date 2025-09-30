public class Profesor extends Empleado {
    private String especialidad;

    public Profesor(String nombre, String id, String email, double salario, String depto, String especialidad) {
        super(nombre, id, email, salario, depto);
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("--- Empleado: Profesor ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("ID: " + this.idUniversitario);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Especialidad: " + this.especialidad);
        System.out.println("Salario: $" + this.salario);
    }

    @Override
    public double calcularBonoAnual() {
        return this.salario * 0.15;
    }
}