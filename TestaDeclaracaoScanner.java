import java.util.Scanner;

public class TestaDeclaracaoScanner {
    public static void main(String[] args) {
        //Lê a partir da linha de comando
        System.out.println("Qual seu nome?");
        Scanner nome = new Scanner(System.in);

        String conjunto = String.format("Meu nome é %s",nome.nextLine());
        System.out.println(conjunto);

    }
}