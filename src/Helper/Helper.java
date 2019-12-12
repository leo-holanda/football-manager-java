package Helper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Helper {
    static Scanner reader = new Scanner(System.in);
    static int input;

    public static int readInput(String question) {
        System.out.print(question + " ");

        while(true) {
            try {
               return input = reader.nextInt();
            }catch (InputMismatchException e) {
                System.out.print("Apenas numeros sao validos! Digite novamente: ");
                reader.next();
            }
        }
    }
}
