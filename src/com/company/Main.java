package com.company;
import UserInterface.*;
import Squad.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Squad squad = new Squad();

        UserInterface userInterface = new UserInterface(reader, squad);
        userInterface.start();
    }
}
