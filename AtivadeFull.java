import java.util.Scanner;

public class AtivadeFull {

    public static void SaidaNome(String[] name) {
        System.out.println("Qual seu nome?");
        Scanner entrada = new Scanner(System.in);

        String nome = entrada.nextLine();
        System.out.println("Meu nome é " + nome);
        entrada.close();
    }

    public static void SaidaIdade(String[] name) {
        Scanner ano = new Scanner(System.in);

        System.out.println("Qual seu ano de nascimento?");

        int ano_nascimento = ano.nextInt();
        int idade = 2023 - ano_nascimento;

        System.out.println("Sua idade é " + idade);
        ano.close();
    }

    public static void PrintAturaPeso(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("peso:");
        float peso = entrada.nextFloat();
        System.out.println("altura:");
        float altura = entrada.nextFloat();

        String conjunto = String.format("Peso: %.1f| Altura :%.2f ", peso, altura);

        System.out.println(conjunto);
        entrada.close();

    }

    public static void SomaDiferensa(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o primeiro numero:");
        int num1 = entrada.nextInt();
        System.out.println("digite o segundo numero");
        int num2 = entrada.nextInt();

        String conjunto = String.format("A soma  dos numeros é %d", num1 + num2);
        String conjunto2 = String.format("A subtração dos numeros é %d", num1 - num2);

        System.out.println(conjunto);
        System.out.println(conjunto2);
        entrada.close();

    }

    public static void SomaSubMulDiv(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o primeiro numero:");
        int num1 = entrada.nextInt();
        System.out.println("digite o segundo numero");
        int num2 = entrada.nextInt();

        String conjunto = String.format("A soma  dos numeros é %d", num1 + num2);
        String conjunto2 = String.format("A subtração dos numeros é %d", num1 - num2);
        String conjunto3 = String.format("A multiplicação  dos numeros é %d", num1 * num2);
        String conjunto4 = String.format("A divisão dos numeros é %d", num1 / num2);

        System.out.println(conjunto);
        System.out.println(conjunto2);
        System.out.println(conjunto3);
        System.out.println(conjunto4);
        entrada.close();

    }

    public static void Media3Notas(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite a primeira nota:");
        String num1 = entrada.nextLine();
        System.out.println("digite a segunda nota:");
        String num2 = entrada.nextLine();
        System.out.println("digite a terceiro nota:");
        String num3 = entrada.nextLine();

        float nota1 = Float.parseFloat(num1);
        float nota2 = Float.parseFloat(num2);
        float nota3 = Integer.parseInt(num3);

        float media = (float) ((nota1 + nota2 + nota3) / 3.0);

        String conjunto = String.format("A media do aluno é %.2f", media);

        System.out.println(conjunto);
        entrada.close();

    }

    public static void HorasTrabalhadas(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual seu nome?  ");
        String nome = entrada.nextLine();
        System.out.println("Quantas horas por mes voce trabalha?  ");
        int horas_trabalhadas = entrada.nextInt();
        System.out.println("Quantas quanto voce ganha por hora?  ");
        int lucro_horas = entrada.nextInt();

        String conjunto = String.format("%s, voce vai ganhar esse mes é %d", nome, horas_trabalhadas * lucro_horas);
        System.out.println(conjunto);
        entrada.close();

    }

    public static void Tela(String[] args) {
        System.out.println("-----------------------------");
        System.out.println("-        Atividade-1        -");
        System.out.println("-        Atividade-2        -");
        System.out.println("-        Atividade-3        -");
        System.out.println("-        Atividade-4        -");
        System.out.println("-        Atividade-5        -");
        System.out.println("-        Atividade-6        -");
        System.out.println("-        Atividade-7        -");

        System.out.println("-----------------------------");
        System.out.print(">>>> Atividade-");
    }

    public static void main(String[] args) {
        Tela(args);
        Scanner entrada = new Scanner(System.in);

        int resposta = entrada.nextInt();
        System.out.println("+---------------+");

        switch (resposta) {

            case 1:
                SaidaNome(args);
                break;

            case 2:
                SaidaIdade(args);
                break;

            case 3:
                PrintAturaPeso(args);
                break;
            case 4:
                SomaDiferensa(args);
                break;
            case 5:
                Media3Notas(args);
                break;
            case 6:
                HorasTrabalhadas(args);
                break;
            case 7:
                SaidaNome(args);

                break;
            default:
                System.out.println("ERRO TCHAU");
                entrada.close();

                break;

        }
        System.out.println("+---------------+");

        entrada.close();

    }

}
