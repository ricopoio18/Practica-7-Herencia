package Clases;

import java.util.Random;

public class SensorTemperatura extends Sensor{
    double valorActual;

    public SensorTemperatura(String modelo, String fabricante, double consumoEnergia, boolean encendido, String unidadMedida, boolean estaCalibrado) {
        super(modelo, fabricante, consumoEnergia, encendido, unidadMedida, estaCalibrado);
        this.valorActual = 0.0;
    }
    @Override
    public double leerValor() {
        Random rmd = new Random();
        System.out.println("Leyendo temperatura ...");
        return valorActual = 20.0 + rmd.nextDouble(16.0);
    }
}
