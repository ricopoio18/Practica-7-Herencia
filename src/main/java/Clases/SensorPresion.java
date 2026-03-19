package Clases;

import java.util.Random;

/**
 * Representa un sensor de presión.
 * Hereda de la clase abstracta Sensor e implementa el método leerValor()
 * para simular la medición de presión atmosférica.
 *
 * Genera valores aleatorios dentro de un rango típico (900 a 1100)
 * para simular lecturas reales.
 *
 * @author Josué Rodrigo Rico Arreola
 */
public class SensorPresion extends Sensor {

    /** Almacena la última lectura de presión */
    double valorActual;

    /**
     * Constructor que inicializa los atributos del sensor de presión
     * y de la clase base.
     *
     * @param modelo Modelo del sensor
     * @param fabricante Nombre del fabricante
     * @param consumoEnergia Consumo de energía en watts
     * @param encendido Estado inicial del dispositivo
     * @param unidadMedida Unidad de medida (por ejemplo: hPa)
     * @param estaCalibrado Indica si el sensor está calibrado
     */
    public SensorPresion(String modelo, String fabricante, double consumoEnergia, boolean encendido,
                         String unidadMedida, boolean estaCalibrado) {
        super(modelo, fabricante, consumoEnergia, encendido, unidadMedida, estaCalibrado);
        this.valorActual = 0.0;
    }

    /**
     * Simula la lectura de presión atmosférica.
     * Genera un valor aleatorio dentro del rango de 900 a 1100
     * y lo almacena como la lectura actual.
     *
     * @return Valor de presión generado aleatoriamente
     */
    @Override
    public double leerValor() {
        Random rmd = new Random();
        System.out.println("Leyendo presion ...");
        return valorActual = 900.0 + rmd.nextDouble(200);
    }
}
