// Subclase abstracta que hereda de Universitario
public abstract class Empleado extends Universitario {
    protected double salario;
    protected String departamento;

    public Empleado(String nombre, String idUniversitario, String email, double salario, String departamento) {
        super(nombre, idUniversitario, email); // Llama al constructor del padre
        this.salario = salario;
        this.departamento = departamento;
    }

    // Implementamos la actividad principal para todos los empleados.
    @Override
    public void realizarActividadPrincipal() {
        System.out.println("Actividad Principal: Trabajando en el departamento de " + this.departamento + ".");
    }

    // Método abstracto específico para Empleados
    public abstract double calcularBonoAnual();
}
