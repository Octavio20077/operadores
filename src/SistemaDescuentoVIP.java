import java.util.Scanner;

public class SistemaDescuentoVIP {
    public static void main(String[] args) {
        System.out.println("***Sistema de descueto VIP***");
         var cantidadProductodescuento = 10;
         var consola = new Scanner(System.in);

        System.out.print("--Cuantos productos compraste hoy?: ");
        var cantProductos = Integer.parseInt(consola.nextLine());

        System.out.print("--Tienes la membresia?:");
        var Membresia = Boolean.parseBoolean(consola.nextLine());

        var eselegibleEldescuento = cantProductos >= cantidadProductodescuento && Membresia;
        System.out.print("Tienes acceso al descuento VIP: = " + eselegibleEldescuento);



    }
}
