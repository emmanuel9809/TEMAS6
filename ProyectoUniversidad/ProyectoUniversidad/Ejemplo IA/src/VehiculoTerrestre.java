public abstract class VehiculoTerrestre extends Vehiculo {
    protected int numeroRuedas;

    public VehiculoTerrestre(String marca, String modelo, int numeroRuedas) {
        super(marca, modelo);
        this.numeroRuedas = numeroRuedas;
    }

    // Un método específico para vehículos terrestres
    public abstract void conducir();
}