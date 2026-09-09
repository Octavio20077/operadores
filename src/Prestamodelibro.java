import java.util.Scanner;

public class Prestamodelibro {
    public static void main(String[] args) {
        System.out.println("***Sistema de pretamo de libro***");
        final var distanciaPermitidakm = 3;
        var conosla = new Scanner(System.in);

        System.out.print("Cuentas con credencial de estudiante?: ");
        var credencial = Boolean.parseBoolean(conosla.nextLine());

        System.out.print("A cuantos km vives de la biblioteca?: ");
        var cuantosKm = Integer.parseInt(conosla.nextLine());

        var eselegibleElpretamo = credencial || cuantosKm <= distanciaPermitidakm;
        System.out.print("eselegibleElpretamo = " + eselegibleElpretamo);

    }
}
