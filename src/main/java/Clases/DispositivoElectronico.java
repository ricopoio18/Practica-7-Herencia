package Clases;

/**
 * Clase que representa un dispositivo electrónico genérico.
 * Contiene información básica como modelo, fabricante, consumo de energía
 * y su estado (encendido o apagado).
 *
 * @author Josué Rodrigo Rico Arreola
 */
public class DispositivoElectronico {

    /** Modelo del dispositivo */
    private String modelo;

    /** Nombre del fabricante */
    private String fabricante;

    /** Consumo de energía en watts (W) */
    private double consumoEnergia;

    /** Indica si el dispositivo está encendido */
    private boolean encendido;

    /**
     * Constructor que inicializa los atributos del dispositivo electrónico.
     *
     * @param modelo Identificador del modelo
     * @param fabricante Nombre del fabricante
     * @param consumoEnergia Consumo de energía en watts
     * @param encendido Estado inicial del dispositivo (true = encendido, false = apagado)
     */
    public DispositivoElectronico(String modelo, String fabricante, double consumoEnergia, boolean encendido) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.consumoEnergia = consumoEnergia;
        this.encendido = encendido;
    }

    /**
     * Enciende el dispositivo si está apagado.
     * Imprime un mensaje indicando el estado.
     */
    public void encender() {
        if (!encendido){
            encendido = true;
            System.out.println("Dispositivo encendido");
        } else {
            System.out.println("El dispositivo ya está encendido.");
        }
    }

    /**
     * Apaga el dispositivo si está encendido.
     * Imprime un mensaje indicando el estado.
     */
    public void apagar() {
        if (encendido){
            encendido = false;
            System.out.println("apagado");
        } else {
            System.out.println("El dispositivo ya está apagado.");
        }
    }

    /**
     * Obtiene el estado actual del dispositivo en forma de texto.
     *
     * @return Cadena con la información del modelo, fabricante,
     * consumo de energía y estado (encendido o apagado)
     */
    public String obtenerEstado(){
        String cadena = "";
        if (encendido){
            cadena += "encendido";
        } else {
            cadena += "apagado";
        }

        return "\nModelo: " + modelo +
                "\nFabricante: " + fabricante +
                "\nConsumo de energía: " + consumoEnergia +
                "\nEstado: " + cadena;
    }
}
