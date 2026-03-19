package Clases;

import java.util.Random;

/**
 * Representa un sensor de temperatura.
 * Hereda de la clase abstracta Sensor e implementa el método leerValor()
 * para simular la medición de temperatura.
 *
 * Genera valores aleatorios dentro de un rango específico para simular
 * lecturas reales del sensor.
 *
 * @author Josué Rodrigo Rico Arreola
 */
public class SensorTemperatura extends Sensor {

    /** Almacena la última lectura de temperatura */
    double valorActual;

    /**
     * Constructor que inicializa los atributos del sensor de temperatura
     * y de la clase base.
     *
     * @param modelo Modelo del sensor
     * @param fabricante Nombre del fabricante
     * @param consumoEnergia Consumo de energía en watts
     * @param encendido Estado inicial del dispositivo
     * @param unidadMedida Unidad de medida (por ejemplo: °C)
     * @param estaCalibrado Indica si el sensor está calibrado
     */
    public SensorTemperatura(String modelo, String fabricante, double consumoEnergia, boolean encendido,
                             String unidadMedida, boolean estaCalibrado) {
        super(modelo, fabricante, consumoEnergia, encendido, unidadMedida, estaCalibrado);
        this.valorActual = 0.0;
    }

    /**
     * Simula la lectura de temperatura.
     * Genera un valor aleatorio dentro de un rango aproximado y lo almacena
     * como la lectura actual.
     *
     * @return Valor de temperatura generado aleatoriamente
     */
    @Override
    public double leerValor() {
        Random rmd = new Random();
        System.out.println("Leyendo temperatura ...");
        return valorActual = 20.0 + rmd.nextDouble(16.0);
    }
}