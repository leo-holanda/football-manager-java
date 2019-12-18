package com.leonardo.helper;

import com.leonardo.contract.Contract;
import com.leonardo.player.Player;
import com.leonardo.staff.Staff;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Helper {
    static Scanner reader = new Scanner(System.in);

    public static int readIntInput(String question) {
        int input;
        System.out.print("\n" + question + " ");

        while(true) {
            try {
               input = reader.nextInt();
               reader.nextLine();
               return input;
            }catch (InputMismatchException e) {
                System.out.print("Entrada invalida! Digite novamente: ");
                reader.next();
            }
        }
    }

    public static String readTextInput(String question) {
        String text_input;
        System.out.print("\n" + question + " ");

        while(true) {
            try {
                text_input = reader.nextLine();
                return text_input;
            }catch (InputMismatchException e) {
                System.out.print("Entrada invalida! Digite novamente: ");
                reader.next();
            }
        }
    }

    public static Double readDoubleInput(String question) {
        double double_input;
        System.out.print("\n" + question + " ");

        while(true) {
            try {
                double_input = reader.nextDouble();
                return double_input;
            }catch (InputMismatchException e) {
                System.out.print("Entrada invalida! Digite novamente: ");
                reader.next();
            }
        }
    }

    public static Player readPlayerInput(){
        String name = readTextInput("Digite o nome do jogador: ");
        int age = readIntInput("Digite a idade do jogador: ");
        String position = readTextInput("Digite a posicao preferida do jogador: ");
        int length = readIntInput("Digite a duracao do contrato do jogador: ");
        String type = readTextInput("Digite o tipo de contrato do jogador: ");
        double wage = readDoubleInput("Digite o salario do jogador: ");

        Contract new_contract = new Contract(length,type,wage);
        return new Player(name, age, new_contract, position);
    }

    public static Staff readStaffInput(){
        String name = readTextInput("Digite o nome do staff: ");
        int age = readIntInput("Digite a idade do staff: ");
        String role = readTextInput("Digite a funcao do staff: ");
        String qualification = readTextInput("Digite a qualificacao do staff: ");
        int length = readIntInput("Digite a duracao do contrato do staff: ");
        String type = readTextInput("Digite o tipo de contrato do staff: ");
        double wage = readDoubleInput("Digite o salario do staff: ");

        Contract new_contract = new Contract(length,type,wage);
        return new Staff(name, age, new_contract, role, qualification);
    }
}