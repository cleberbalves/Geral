import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        System.out.println("Digite a tabuada que você deseja: ");

        Scanner in = new Scanner(System.in);


        int tabuada = in.nextInt();

        for(int i = 1; i <= 10; i++){

            System.out.println(tabuada +
                    " x " +
                    i +
                    " = " +
                    (tabuada*i));

        }
    }

    }

