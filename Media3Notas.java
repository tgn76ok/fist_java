import java.util.Scanner;

public class Media3Notas {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        System.out.println("digite a primeira nota:");
        String num1 = entreda.nextLine();
        System.out.println("digite a segunda nota:");
        String num2 = entreda.nextLine();
        System.out.println("digite a terceiro nota:");
        String num3 = entreda.nextLine();


        float nota1 = Integer.parseInt(num1);
        float nota2 = Integer.parseInt(num2);
        float nota3 = Integer.parseInt(num3);

        float media = (float) ((nota1+nota2+nota3)/3.0);

        String conjunto = String.format("A media do aluno é %.2f",media);


        System.out.println(conjunto);


    }
}
