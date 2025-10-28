package modelos;

public class Compras {
    private String descripcionCompra;
    private double valorCompra;

    public Compras() {

    }

    public Compras(String descripcionCompra, double valorCompra) {
        this.descripcionCompra = descripcionCompra;
        this.valorCompra = valorCompra;
    }

    public void setDescripcionCompra(String descripcionCompra) {
        this.descripcionCompra = descripcionCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
}
