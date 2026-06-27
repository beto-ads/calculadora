import java.util.Scanner;

public class calcularDesconto {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double valor;
        double desconto = 0.10;

        System.out.println("Qual o valor do Produto");
        valor = leia. nextDouble();

        System.out.println("O valor final é de " + calculoDesconto(valor, desconto) + "Reais");

    }

    public static double calculoDesconto(double valor, double desconto){
        if(valor > 100){
            return valor * 0.90;
        }else {
            return valor;
        }
    }
}
