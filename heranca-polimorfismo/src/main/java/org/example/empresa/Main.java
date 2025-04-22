package org.example.empresa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        double rendaBasica = 1000.00;

        Funcionario[] listaFuncionario = new Funcionario[10];
        // 4 pessoas com Ensino Básico (40%)
        listaFuncionario[0] = new Gerente("Robesvaldo", "Sptech", "Ensino básico");
        listaFuncionario[1] = new Surpervisor("Julio", "Sptech", "Ensino básico");
        listaFuncionario[2] = new Surpervisor("Carlos", "Sptech", "Ensino básico");
        listaFuncionario[3] = new Vendedor("Ana", "Sptech", "Ensino básico");

        // 4 pessoas com Ensino Médio (40%)
        listaFuncionario[4] = new Vendedor("Monica", "Sptech", "Ensino médio");
        listaFuncionario[5] = new Vendedor("Lucas", "Sptech", "Ensino médio");
        listaFuncionario[6] = new Vendedor("Juliana", "Sptech", "Ensino médio");
        listaFuncionario[7] = new Vendedor("Bruna", "Sptech", "Ensino médio");

        // 2 pessoas com Nível Superior (20%)
        listaFuncionario[8] = new Vendedor("Maikon", "Sptech", "Nível superior");
        listaFuncionario[9] = new Vendedor("Monica", "Sptech", "Nível superior");

        Funcionario funcionario = new Funcionario();
        double rendaTotal = 0;
        for (int i = 0; i < listaFuncionario.length; i++) {
           listaFuncionario[i].setRenda(funcionario.calcularRendaPorEscolaridade(listaFuncionario[i].getNivelEscolaridade()));
           listaFuncionario[i].setRenda(listaFuncionario[i].calcularRendaTotal());
           rendaTotal += listaFuncionario[i].getRenda();

        }
        System.out.println(Arrays.toString(listaFuncionario));

//
//        while (true){
//            System.out.println("Nome do funcionario: ");
//            String nome = scanner.nextLine();
//
//            System.out.println("""
//                    Nivel esccolaridade
//
//                    1 - Não estudou
//                    2 - Ensino básico
//                    3 - Ensino médio
//                    4 - Universidade
//                    """);
//            int resp = scannerInt.nextInt();
//
//            String nivelEscolaridade = "";
//
//
//
//            double renda = 0;
//
//            if(resp > 1){
//
//                System.out.println("Nome da instituição: ");
//                String instituicao = scanner.nextLine();
//
//                switch (resp){
//                    case 2:
//                        nivelEscolaridade = "Ensino básico";
//                        renda = renda1;
//                        break;
//                    case 3:
//                        nivelEscolaridade = "Ensino médio";
//                        renda = renda2;
//                        break;
//                    case 4:
//                        nivelEscolaridade = "Universidade";
//                        renda = renda3;
//                        break;
//                }
//
//                funcionarios.add(new Funcionario(nome, instituicao, nivelEscolaridade));
//
//            }else {
//                nivelEscolaridade = "Não estudou";
//                System.out.println("Digite seu código:");
//                int codigo = scanner.nextInt();
//
//                funcionarios.add(new Funcionario(nome, nivelEscolaridade, codigo));
//            }
//
//
//
//            System.out.println("Deseja encerrar ? S ou N");
//            String fim = scanner.next();
//
//            if (fim.equalsIgnoreCase("S")){
//                break;
//            }
//
//            scanner.nextLine();
//
//        }
//
//        System.out.println(funcionarios.toString());

    }
}
