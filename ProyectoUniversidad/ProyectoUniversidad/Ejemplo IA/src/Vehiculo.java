abstract class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Comportamientos que todo vehículo debe tener, pero cada uno a su manera
    public abstract void encender();
    public abstract void acelerar();
    public abstract String obtenerTipo();
}