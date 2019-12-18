package com.leonardo;
import com.leonardo.UserInterface.*;
import com.leonardo.Squad.*;
import com.leonardo.Backroom.*;

public class Main {

    public static void main(String[] args) {
        Squad squad = new Squad();
        Backroom backroom = new Backroom();

        UserInterface userInterface = new UserInterface(squad, backroom);
        userInterface.start();
    }
}
