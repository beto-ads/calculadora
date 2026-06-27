import java.util.Scanner;

public class Verificar_Nota {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double n1, n2, n3;

        System.out.println("Informe sua Primeira Nota:");
        n1 = leia.nextDouble();
        System.out.println("Informe sua Segunda Nota:");
        n2 = leia.nextDouble();
        System.out.println("Informe sua Terceira Nota:");
        n3 = leia.nextDouble();

        System.out.println(calcularMedia(n1, n2, n3));
    }

    public static String calcularMedia(double n1, double n2,double n3){
        double media = (n1 + n2 + n3)/3;

        if (media >= 7.0){
            return "Aprovado";
        }else if (media < 7.0){
            return "Recuperação";
        }else {
            return "Reprovado";
        }
    }

}
