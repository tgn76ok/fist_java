/*Faça um programa que recebe o nome de umfuncionário, o número de horas trabalhadas e o valorque recebe por hora.
Com estas informações, calcular osalário deste funcionário e exibir seu nome e salário final.*/

import java.util.Scanner;


public class HorasTrabalhadas {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        System.out.println("Qual seu nome?  ");
        String nome = entreda.nextLine();
        System.out.println("Quantas horas por mes voce trabalha?  ");
        int horas_trabalhadas = entreda.nextInt();
        System.out.println("Quantas quanto voce ganha por hora?  ");
        int lucro_horas = entreda.nextInt();

        String conjunto = String.format("%s, voce vai ganhar esse mes é %d",nome,horas_trabalhadas*lucro_horas);
        System.out.println(conjunto);

    }
}
