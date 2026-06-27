import java.util.Scanner;

public class calcular_imc {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        float peso, altura;

        System.out.println("Informe seu Peso:");
        peso = leia.nextFloat();
        System.out.println("Informe seu Altura:");
        altura = leia.nextFloat();

    }

    public static String calcularIMC(float peso, float altura){
        float resultadoIMC;

       resultadoIMC = peso / (altura *altura);

       if (resultadoIMC <= 18.5){
           return "Abaixo do Peso";
       }else if (resultadoIMC >= 18.5 && resultadoIMC <= 24.9){
            return "Peso Normal";
       }else {
           return "SobrePeso";
       }
    }
}
