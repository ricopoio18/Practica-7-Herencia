package Clases;

public class DispositivoElectronico {
    private String modelo;
    private String fabricante;
    private double consumoEnergia;
    private boolean encendido;

    public DispositivoElectronico(String modelo, String fabricante, double consumoEnergia, boolean encendido) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.consumoEnergia = consumoEnergia;
        this.encendido = encendido;
    }

    public void encender() {
        if (!encendido){
            encendido = true;
            System.out.println("encendido");
        }
    }

    public void apagar() {
        if (encendido){
            encendido = false;
            System.out.println("apagado");
        }
    }

    public String obtenerEstado(){
        String cadena = "";
        if (encendido){
            cadena += "encendido";
        }else{
            cadena += "apagado";
        }

        return "\n Modelo: " + modelo +
                "\nFabricante: " + fabricante +
                "\nConsumo de energía: " + consumoEnergia +
                "\nEstado: " + cadena;
    }
}
