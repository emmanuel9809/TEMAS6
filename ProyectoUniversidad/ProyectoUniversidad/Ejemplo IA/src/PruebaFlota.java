import java.util.ArrayList;
import java.util.List;

public class PruebaFlota {
    public static void main(String[] args) {
        List<Vehiculo> miFlota = new ArrayList<>();
        miFlota.add(new Coche("Ford", "Mustang"));
        miFlota.add(new Avion("Boeing", "747"));

        for (Vehiculo v : miFlota) {
            System.out.println("--- Probando Vehículo Tipo: " + v.obtenerTipo() + " ---");
            v.encender();
            v.acelerar();

            // Verificamos el tipo para llamar a métodos específicos
            if (v instanceof Coche) {
                ((Coche) v).conducir();
            } else if (v instanceof Avion) {
                ((Avion) v).despegar();
            }
            System.out.println();
        }
    }
}