package principal;

import modelos.Compras;
import modelos.TarjetaCredito;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    static void main() {

        Scanner lector = new Scanner(System.in);
        Compras compras = new Compras();
        TarjetaCredito tarjetaCredito = new TarjetaCredito();

        System.out.println("""
                !Señor(@) usuario bienvenido a su aplicación de compras Deportivas¡
                
                """);

        System.out.println("Ingrese el valor límite para la tarjeta: ");
        tarjetaCredito.setLimiteTarjeta(lector.nextDouble());

        System.out.println("El límite establecido para su tarjeta de crédito es: " + tarjetaCredito.getLimiteTarjeta());

        List miListaDeCompras = new ArrayList<>();
//        TarjetaCredito tarjetaCredito = new TarjetaCredito();


    }
}
