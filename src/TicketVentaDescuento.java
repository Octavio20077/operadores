import java.util.Scanner;

public class TicketVentaDescuento {
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

        //consultamos si desea algun descuento
        System.out.print("-Desea algun descuento (%)?: ");
        var descuento = Integer.parseInt(consola.nextLine());

        //Hacemos la suma del percio de los productos sin impuestos
        var subTotal = precioLeche + precioPan + precipManzana;

        //  aplicar el descuento
        var descuentoAgregado = subTotal * (descuento / 100.0);

        //subtotat con descuento
        var subTotalconDescuento = subTotal - descuentoAgregado;

        //calculamos el impuesto
        var impuesto = subTotalconDescuento * 0.09;

        //calculo total de la compra
        var costoTotalcompra = subTotalconDescuento + impuesto;

        //Imprimimos el ticket
        System.out.printf("""
                %n Impresion de ticket
                %n----------------------
                subTotal: $%.2f
                Descuento: $%.2f (%d%%) 
                impuesto (9%%): $%.2f 
                CostoTotal: $%.2f 
                """, subTotal,descuentoAgregado, descuento, impuesto,costoTotalcompra);

    }
}

