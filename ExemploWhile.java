import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile   {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada>0) {
            Double valorDoce = valorAleatorio( );
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + "Adicionado na cesta"   );
            mesada =    mesada - valorDoce;

        }
        System.out.println("Mesada:" + mesada );
        System.out.println("Davi gastou toda mesada em doces");

    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
