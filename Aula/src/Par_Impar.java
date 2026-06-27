import java.util.Scanner;

public class Par_Impar {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero:");
        numero = leia.nextInt();

        System.out.println("O numero é " + verificar(numero));
    }

    public static boolean verificar(int numero){
        if (numero % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
