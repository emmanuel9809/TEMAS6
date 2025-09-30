public class EstudianteADistancia extends Estudiante {
    private String plataformaVirtual;

    public EstudianteADistancia(String nombre, String idUniversitario, String email, String carrera, String plataforma) {
        super(nombre, idUniversitario, email, carrera);
        this.plataformaVirtual = plataforma;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("--- Estudiante a Distancia ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("ID: " + this.idUniversitario);
        System.out.println("Carrera: " + this.carrera);
        System.out.println("Plataforma: " + this.plataformaVirtual);
    }
}