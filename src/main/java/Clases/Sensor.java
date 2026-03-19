package Clases;

/**
 * Clase abstracta que representa un sensor genérico.
 * Hereda de DispositivoElectronico y define características comunes
 * para todos los sensores, como la unidad de medida y el estado de calibración.
 *
 * No puede ser instanciada directamente, ya que no define una implementación
 * concreta del método leerValor().
 *
 * Las subclases deben implementar el método leerValor() para definir
 * cómo se realiza la medición específica.
 *
 * @author Josué Rodrigo Rico Arreola
 */
public abstract class Sensor extends DispositivoElectronico {

    /** Unidad en la que el sensor realiza la medición (ej: °C, hPa, m/s^2) */
    protected String unidadMedida;

    /** Indica si el sensor ha sido calibrado */
    protected boolean estaCalibrado;

    /**
     * Constructor que inicializa los atributos del sensor y de la clase base.
     *
     * @param modelo Modelo del dispositivo
     * @param fabricante Nombre del fabricante
     * @param consumoEnergia Consumo de energía en watts
     * @param encendido Estado inicial del dispositivo
     * @param unidadMedida Unidad de medida del sensor
     * @param estaCalibrado Estado inicial de calibración
     */
    public Sensor(String modelo, String fabricante, double consumoEnergia, boolean encendido,
                  String unidadMedida, boolean estaCalibrado) {
        super(modelo, fabricante, consumoEnergia, encendido);
        this.unidadMedida = unidadMedida;
        this.estaCalibrado = estaCalibrado;
    }

    /**
     * Simula el proceso de calibración del sensor.
     * Si el sensor no está calibrado, lo calibra y muestra un mensaje.
     * Si ya está calibrado, informa al usuario.
     */
    public void calibrar() {
        if (!estaCalibrado) {
            estaCalibrado = true;
            System.out.println("Sensor calibrado");
        } else {
            System.out.println("El sensor ya estaba calibrado.");
        }
    }

    /**
     * Método abstracto que debe ser implementado por las subclases.
     * Representa la acción de leer un valor del sensor.
     *
     * @return Valor medido por el sensor
     */
    public abstract double leerValor();
}