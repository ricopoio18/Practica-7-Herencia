package Clases;

import java.util.Random;
/**
 * Representa un sensor de aceleración.
 * Hereda de la clase abstracta Sensor e implementa el método leerValor()
 * para simular lecturas en los tres ejes (X, Y, Z).
 *
 * Calcula la magnitud de la aceleración utilizando la fórmula:
 * sqrt(x^2 + y^2 + z^2).
 *
 * @author Josué Rodrigo Rico Arreola
 */
public class SensorAceleracion extends Sensor{
    private double valorEjeX;
    private double valorEjeY;
    private double valorEjeZ;

    /**
     * Constructor que inicializa los atributos del sensor de aceleración
     * y de la clase base.
     *
     * @param modelo Modelo del sensor
     * @param fabricante Nombre del fabricante
     * @param consumoEnergia Consumo de energía en watts
     * @param encendido Estado inicial del dispositivo
     * @param unidadMedida Unidad de medida (por ejemplo: m/s^2)
     * @param estaCalibrado Indica si el sensor está calibrado
     */
    public SensorAceleracion(String modelo, String fabricante, double consumoEnergia, boolean encendido, String unidadMedida, boolean estaCalibrado) {
        super(modelo, fabricante, consumoEnergia, encendido, unidadMedida, estaCalibrado);
        valorEjeX = 0.0;
        valorEjeY = 0.0;
        valorEjeZ = 0.0;
    }

    /**
     * Simula la lectura de aceleración en los tres ejes.
     * Genera valores aleatorios para cada eje, los imprime y calcula
     * la magnitud total del vector de aceleración.
     *
     * @return Magnitud de la aceleración calculada a partir de los tres ejes
     */
    @Override
    public double leerValor() {
        System.out.println("Leyendo aceleracion de los 3 ejes");
        double magnitud = 0.0;
        Random rmd = new Random();

        valorEjeX = 90 + rmd.nextDouble(100);
        valorEjeY = 90 + rmd.nextDouble(100);
        valorEjeZ = 90 + rmd.nextDouble(100);

        System.out.println("Eje X: " + valorEjeX + " " + unidadMedida);
        System.out.println("Eje Y: " + valorEjeY + " " + unidadMedida);
        System.out.println("Eje Z: " + valorEjeZ + " " + unidadMedida);

        magnitud = Math.sqrt(Math.pow(valorEjeX, 2) + Math.pow(valorEjeY, 2) + Math.pow(valorEjeZ, 2));
        return magnitud;
    }

}
