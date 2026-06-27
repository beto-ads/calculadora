import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero;

        System.out.println("Escolha a tabuada que você deseja saber ");
        numero = leia.nextInt();

        tabuada(numero);

    }

    public static void tabuada(int numero){
        System.out.println("--------Tabuada-------");
        for ( int i = 1; i <= 10; i++){
            System.out.println(numero + " X " + i + " = " + numero*i);
        }
    }

}
