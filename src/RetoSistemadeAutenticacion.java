import java.util.Scanner;

public class RetoSistemadeAutenticacion {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        //Sacar datos definitivos que quedan guardados
        final String NombreUsuario = "Octasss";
        final long Password = 244466666L;
        //Imprimir en la consola

        System.out.println("---Sistema de Autenticacion de Datos---");

        System.out.print("--Ingresa tu nombre de usuario: ");
        String Nombre = consola.nextLine();

        System.out.print("--Ingresa tu password: ");
        long PasswordUsuario = Long.parseLong(consola.nextLine());

        boolean VerificarDatos = NombreUsuario.equals(Nombre) && Password == PasswordUsuario;
        System.out.print("--Son correctos los datos?: = " + VerificarDatos);




    }
}
