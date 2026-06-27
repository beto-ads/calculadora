import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        //mensagem de entrada
        Scanner leia = new Scanner(System.in);

        // para armazenar os produtos
        ArrayList<String> lista = new ArrayList<>();

        // Variável para guardar o nome do produto
        String produto;

        // Mensagem inicial
        System.out.println("Digite produtos (digite 'fim' para encerrar): ");
        produto = leia.nextLine();
        // Loop infinito até o usuário digitar "fim"
        while (true) {

            // Lê o produto digitado


            // Se digitar "fim", encerra o loop
            if (produto.equals("fim")) {
                break;
            }

            // Adiciona o produto na lista
            lista.add(produto);
        }

        // Mostra título
        System.out.println("Produtos cadastrados:");

        // Percorre a lista e imprime cada produto
        for (String item : lista) {
            System.out.println("- " + item);
        }
    }
}
