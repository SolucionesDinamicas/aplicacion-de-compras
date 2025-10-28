package modelos;

public class TarjetaCredito {
   private double limiteTarjeta;


    public void setLimiteTarjeta(double limiteTarjeta) {
        this.limiteTarjeta = limiteTarjeta;
    }

    public double getLimiteTarjeta() {
        return limiteTarjeta;
    }

    //Metodo para sumar al saldo de la tarjeta el valor comprado
    public void valorLimiteTarjeta(double valor){
        this.limiteTarjeta-= valor;
    }






}
