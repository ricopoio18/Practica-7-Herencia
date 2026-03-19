package Clases;

public abstract class Sensor extends DispositivoElectronico{
    private String unidadMedida;
    private boolean estaCalibrado;

    public Sensor(String modelo, String fabricante, double consumoEnergia, boolean encendido, String unidadMedida, boolean estaCalibrado){
        super(modelo, fabricante, consumoEnergia, encendido);
        this.unidadMedida = unidadMedida;
        this.estaCalibrado = estaCalibrado;
    }


    public void calibrar(){
        if (!estaCalibrado){
            estaCalibrado = true;
            System.out.println("Calibrado");
        }else {
            System.out.println("El sensor ya estaba calibrado.");
        }
    }

    public abstract double leerValor();
}
