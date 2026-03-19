package Clases;

import java.util.Random;

public class SensorPresion extends Sensor{
    double valorActual;

    public SensorPresion(String modelo, String fabricante, double consumoEnergia, boolean encendido, String unidadMedida, boolean estaCalibrado, double valorActual) {
        super(modelo, fabricante, consumoEnergia, encendido, unidadMedida, estaCalibrado);
        this.valorActual = valorActual;
    }

    public double leerValor() {
        Random rmd = new Random();
        System.out.println("Leyendo presion ...");
        return valorActual = 900.0 + rmd.nextDouble(1101.0);
    }
}
