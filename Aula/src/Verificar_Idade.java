import java.util.Scanner;

// Código de verificação de idade usando métodos não executaveis

public class Verificar_Idade {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int idade;

        System.out.println("Qual sua Idade? ");
        idade = leia.nextInt();

        // chama o método que verificou a idade e dentor desse método passamos a variavel que guarda a idade do usúario
        System.out.println("Pela sua idade você é " + checarIdade(idade));


    }

    // Método para Verificar a idade do usúario
    public static String checarIdade(int i){
        if (i >= 18){
            return "Maior de Idade";
        }else {
            return "Menor de Idade";
        }
    }
}
