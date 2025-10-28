package principal;
import modelos.Compras;
import modelos.TarjetaCredito;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Principal {
   public static void main(String[] args) {

       String descripcionProducto;
       double valorCompra;
       int seleccion = 1;

        Scanner lector = new Scanner(System.in);
        TarjetaCredito tarjetaCredito = new TarjetaCredito();


        System.out.println("""
                
                --------------------------------------------------------------------
                !Señor(@) usuario bienvenido a su aplicación de compras Deportivas 👟🎾🏓¡                
                """);

        System.out.println("Ingrese el valor límite para la tarjeta: 💳 ");
        tarjetaCredito.setLimiteTarjeta(lector.nextDouble());
        lector.nextLine(); // ← limpia el salto de línea pendiente

        System.out.println("--> El límite establecido a su tarjeta de crédito es: " + tarjetaCredito.getLimiteTarjeta() + "$\n");

        List<Compras> miListaDeCompras = new ArrayList<>();
        //ArrayList<Titulo> lista = new ArrayList<>();

        while (seleccion!= 2){

            switch (seleccion) {
                case 1:

                    System.out.println("Ingrese la descripción del producto: 📦");
                    descripcionProducto = lector.nextLine();
                    System.out.println("Ingrese el valor de la compra: $");
                    valorCompra = lector.nextDouble();
                    lector.nextLine(); // limpiar salto de línea
                     if (tarjetaCredito.getLimiteTarjeta()>= valorCompra) {

                         Compras compras = new Compras(descripcionProducto, valorCompra);
                         miListaDeCompras.add((compras));
                         System.out.println("Compra realizada ✅");

                         //Restamos el valor comprado a la tarjeta de crédito
                         tarjetaCredito.valorLimiteTarjeta(valorCompra);

                         System.out.println("""
                                 MENU:
                                 --------------------
                                 1. Otra compra
                                 2. Terminar compra
                                 """);
                         seleccion = lector.nextInt();
                         lector.nextLine();
                     } else {
                         System.out.println("El valor a comprar: " + valorCompra + " supera el saldo de su tarjeta de crédito: " +tarjetaCredito.getLimiteTarjeta()  +"\n");
                         seleccion = 2;
                     }

                case 2:
                    break;
            }

        }
       System.out.println("""
               Lista de compras 🛍️🛒:
               ------------------------------------
               """);
       miListaDeCompras.sort(Comparator.comparing(Compras::getValorCompra));
       System.out.println(miListaDeCompras + "\n");
       System.out.println("saldo tarjeta: " + tarjetaCredito.getLimiteTarjeta()+ "$");
//
    }
}
