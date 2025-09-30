public class Coche extends VehiculoTerrestre {
    public Coche(String marca, String modelo) {
        super(marca, modelo, 4); // Un coche siempre tiene 4 ruedas
    }

    @Override
    public void encender() { System.out.println("El coche " + marca + " ruge al encender el motor."); }

    @Override
    public void acelerar() { System.out.println("El coche pisa el acelerador y gana velocidad en el asfalto."); }

    @Override
    public String obtenerTipo() { return "Coche"; }

    @Override
    public void conducir() { System.out.println("Conduciendo el " + modelo + " por la carretera."); }
}