import java.util.Scanner;

public class AnoDeNascimento {
    public static void main(String[] args) {
        Scanner ano = new Scanner(System.in);
        System.out.println("Qual seu ano de nascimento?");
        int ano_nascimento = ano.nextInt();
        int idade =  2023 - ano_nascimento ;
        String conjunto = String.format("Sua idade é %d",idade);

        System.out.println(conjunto);
    }
}
