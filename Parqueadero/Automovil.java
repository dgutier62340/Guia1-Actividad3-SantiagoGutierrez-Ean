import java.time.LocalDateTime;

public class Automovil extends Vehiculo {

    private String tipoCombustible;

    // Constructor
    public Automovil(String placa, String marca, String modelo, LocalDateTime horaEntrada, String tipoCombustible) {
        super(placa, marca, modelo, horaEntrada); // Llamada al constructor de la clase base
        this.tipoCombustible = tipoCombustible;
    }

    // Getters & Setters
    public String getTipoCombustible() {
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

}