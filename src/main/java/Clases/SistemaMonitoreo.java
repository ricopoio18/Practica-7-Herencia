package Clases;

import java.util.ArrayList;
public class SistemaMonitoreo {

    public static void main(String[] args) {
        ArrayList<Sensor> listaSensores = new ArrayList<>();

        // se añaden los sensores de temperatura
        listaSensores.add(new SensorTemperatura("T-800", "Temp Sensors", 5.0, false, "°C", false));
        listaSensores.add(new SensorTemperatura("T-2000", "Temp Sensors", 4.5, false, "°C", false));

        // se añaden los sensores de presión
        listaSensores.add(new SensorPresion("QRT-24", "Press Sensors", 6.0, false, "hPa", false));
        listaSensores.add(new SensorPresion("QRT-21", "Press Sensors", 5.5, false, "hPa", false));

        // se añaden los sensores de aceleración
        listaSensores.add(new SensorAceleracion("A100", "Intel", 3.0, false, "m/s^2", false));
        listaSensores.add(new SensorAceleracion("A200", "AMD", 3.5, false, "m/s^2", false));

        for (Sensor sensor : listaSensores) {
            System.out.println("\n-----------------------------");
            sensor.encender();
            sensor.calibrar();
            double valor = sensor.leerValor();
            System.out.println("Valor leído: " + valor + " " + sensor.unidadMedida);
        }
    }
}
