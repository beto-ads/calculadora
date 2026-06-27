import java.util.Scanner;

public class ConversaoDolar {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double valor, cotacao;

        System.out.println("Digite o valor para Cotação");
        valor = leia.nextDouble();
        System.out.println("Digite a cotação do dia:");
        cotacao = leia.nextDouble();

        System.out.println(conversaoDolar(valor, cotacao));

    }

    public static double conversaoDolar(double valor, double cotacao){
        return valor * cotacao;
    }
}
