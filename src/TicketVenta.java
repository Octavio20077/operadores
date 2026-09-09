import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("***Generador de ticket de venta***");
        var consola = new Scanner(System.in);
        //indicamos los precios -- precio de la leche
        System.out.print("-Precio de la leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());
        //precio del pan
        System.out.print("-Precio del pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());
        //precio de la manzana
        System.out.print("-Precio de la manzana: ");
        var precipManzana = Double.parseDouble(consola.nextLine());
        //Hacemos la suma del percio de los productos sin impuestos
        var subTotal = precioLeche + precioPan + precipManzana;
        //calculamos el impuesto
        var impuesto = subTotal * 0.09;
        //calculo total de la compra
        var costoTotalcompra = subTotal + impuesto;
        //Imprimimos el ticket
        System.out.printf("""
                /n Impresion de ticket
                ----------------------
                subTotal: $%.2f
                impuesto (9%%): $%.2f 
                CostoTotal: $%.2f : 
                """, subTotal, impuesto,costoTotalcompra);

    }
}
