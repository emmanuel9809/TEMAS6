public abstract class VehiculoAereo extends Vehiculo {
    protected double altitudMaxima;

    public VehiculoAereo(String marca, String modelo, double altitudMaxima) {
        super(marca, modelo);
        this.altitudMaxima = altitudMaxima;
    }

    // Un método específico para vehículos aéreos
    public abstract void despegar();
}