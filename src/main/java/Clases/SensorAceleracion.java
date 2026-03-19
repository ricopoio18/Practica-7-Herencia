package Clases;

import java.util.Random;

public class SensorAceleracion extends Sensor{
    private double valorEjeX;
    private double valorEjeY;
    private double valorEjeZ;

    public SensorAceleracion(String modelo, String fabricante, double consumoEnergia, boolean encendido, String unidadMedida, boolean estaCalibrado) {
        super(modelo, fabricante, consumoEnergia, encendido, unidadMedida, estaCalibrado);
        valorEjeX = 0.0;
        valorEjeY = 0.0;
        valorEjeZ = 0.0;
    }

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
