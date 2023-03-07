import java.util.Scanner;

public class PrintAturaPeso {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        System.out.println("peso:");
        float peso = entreda.nextFloat();
        System.out.println("altura:");
        float altura = entreda.nextFloat();

        String conjunto = String.format("Peso: %.1f| Altura :%.2f ",peso,altura);

        System.out.println(conjunto);
    }
}
