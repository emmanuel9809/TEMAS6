// Súper clase abstracta
public abstract class Universitario {
    protected String nombre;
    protected String idUniversitario;
    protected String email;

    public Universitario(String nombre, String idUniversitario, String email) {
        this.nombre = nombre;
        this.idUniversitario = idUniversitario;
        this.email = email;
    }

    // Métodos abstractos: No tienen cuerpo, obligan a las subclases a implementarlos.
    // Cada tipo de universitario mostrará sus detalles de forma diferente.
    public abstract void mostrarDetalles();

    // La actividad principal varía para cada rol.
    public abstract void realizarActividadPrincipal();

    // Getters comunes
    public String getNombre() {
        return nombre;
    }
}