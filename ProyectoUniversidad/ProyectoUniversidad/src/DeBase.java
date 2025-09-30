public class DeBase extends Empleado {
    private String puesto;

    public DeBase(String nombre, String id, String email, double salario, String depto, String puesto) {
        super(nombre, id, email, salario, depto);
        this.puesto = puesto;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("--- Empleado: De Base ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("ID: " + this.idUniversitario);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Puesto: " + this.puesto);
        System.out.println("Salario: $" + this.salario);
    }

    @Override
    public double calcularBonoAnual() {
        return this.salario * 0.10;
    }
}