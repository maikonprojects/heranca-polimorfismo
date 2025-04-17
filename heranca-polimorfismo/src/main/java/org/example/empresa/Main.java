package org.example.empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);


        while (true){
            System.out.println("Nome do funcionario: ");
            String nome = scanner.nextLine();

            System.out.println("""
                    Nivel esccolaridade
                    
                    1 - Não estudou 
                    2 - Ensino básico
                    3 - Ensino médio
                    4 - Universidade
                    """);
            int resp = scannerInt.nextInt();

            String nivelEscolaridade = "";

            if(resp > 1){

                System.out.println("Nome da instituição: ");
                String instituicao = scanner.nextLine();

                switch (resp){
                    case 1:
                        nivelEscolaridade = "Não estudou";
                        break;
                    case 2:
                        nivelEscolaridade = "Ensino básico";
                        break;
                    case 3:
                        nivelEscolaridade = "Ensino médio";
                        break;
                    case 4:
                        nivelEscolaridade = "Universidade";
                        break;
                }

                funcionarios.add(new Funcionario(nome, instituicao, nivelEscolaridade));

            }else {

                System.out.println("Digite seu código:");
                int codigo = scanner.nextInt();

                funcionarios.add(new Funcionario(nome, nivelEscolaridade, codigo));
            }

            System.out.println("Deseja encerrar ? S ou N");
            String fim = scanner.next();

            if (fim.equalsIgnoreCase("S")){
                break;
            }

            scanner.nextLine();

        }

        System.out.println(funcionarios.toString());

    }
}
