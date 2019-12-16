package Helper;

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
}