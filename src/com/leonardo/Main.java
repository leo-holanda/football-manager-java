package com.leonardo;
import UserInterface.*;
import Squad.*;
import Backroom.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Squad squad = new Squad();
        Backroom backroom = new Backroom();

        UserInterface userInterface = new UserInterface(squad, backroom);
        userInterface.start();
    }
}
