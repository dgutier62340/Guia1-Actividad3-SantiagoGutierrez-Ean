import java.time.LocalDateTime;

public class Camion extends Vehiculo {

	private double capacidadCarga;

	// Constructor
    public Camion(String placa, String marca, String modelo, LocalDateTime horaEntrada, double capacidadCarga) {
        super(placa, marca, modelo, horaEntrada); // Llamada al constructor de la clase base
        this.capacidadCarga = capacidadCarga;
    }

	// Getters & Setters
    public double getCapacidadCarga() {
        return capacidadCarga;
    }
    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

}
