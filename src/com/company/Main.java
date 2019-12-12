package com.company;
import UserInterface.*;
import Squad.*;
import Backroom.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Squad squad = new Squad();
        Backroom backroom = new Backroom();

        UserInterface userInterface = new UserInterface(reader, squad, backroom);
        userInterface.start();
    }
}
