public class Avion extends VehiculoAereo {
    public Avion(String marca, String modelo) {
        super(marca, modelo, 12000.0); // Altitud en metros
    }

    @Override
    public void encender() { System.out.println("Se inician las turbinas del avión " + marca + "."); }

    @Override
    public void acelerar() { System.out.println("El avión acelera en la pista para ganar sustentación."); }

    @Override
    public String obtenerTipo() { return "Avión"; }

    @Override
    public void despegar() { System.out.println("¡El " + modelo + " despega y se eleva hacia el cielo!"); }
}