import java.util.Scanner;

public class SomaSubMulDiv {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        System.out.println("digite o primeiro numero:");
        int num1 = entreda.nextInt();
        System.out.println("digite o segundo numero");
        int num2 = entreda.nextInt();


        String conjunto = String.format("A soma  dos numeros é %d", num1 + num2);
        String conjunto2 = String.format("A subtração dos numeros é %d", num1 - num2);
        String conjunto3 = String.format("A multiplicação  dos numeros é %d", num1 * num2);
        String conjunto4 = String.format("A divisão dos numeros é %d", num1 / num2);

        System.out.println(conjunto);
        System.out.println(conjunto2);
        System.out.println(conjunto3);
        System.out.println(conjunto4);
    }
}
