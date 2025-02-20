import java.time.LocalDateTime;

public class Motocicleta extends Vehiculo{

	private int cilindraje;

	// Constructor
    public Motocicleta(String placa, String marca, String modelo, LocalDateTime horaEntrada, int cilindraje) {
        super(placa, marca, modelo, horaEntrada); // Llamada al constructor de la clase base
        this.cilindraje = cilindraje;
    }

	// Getters & Setters
	public int getCilindraje() {
		return cilindraje;
	}
	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}
}
