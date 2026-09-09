public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println("***Operadores de comparacion***");
         int a = 3, b = 2;

         //igualdad
        var igualdad = a==b;
        System.out.println("igualdad = " + igualdad);

        //distinto !=
        var distinto = a!=b;
        System.out.println("distinto = " + distinto);

        //Mayor que >
        var resultado = a > b;
        System.out.println("resultado = " + resultado);

        //Mayor o igual >=
        var mayorOigual = a >= b;
        System.out.println("mayorOigual = " + mayorOigual);

        //menor que <
        var menorQue = a < b;
        System.out.println("menorQue = " + menorQue);

        //menor o igual
        var menorOigual = a <= b;
        System.out.println("menorOigual = " + menorOigual);



    }
}
