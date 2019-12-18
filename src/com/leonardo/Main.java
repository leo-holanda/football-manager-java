package com.leonardo;
import com.leonardo.userinterface.*;
import com.leonardo.squad.*;
import com.leonardo.backroom.*;

public class Main {

    public static void main(String[] args) {
        Squad squad = new Squad();
        Backroom backroom = new Backroom();

        UserInterface userInterface = new UserInterface(squad, backroom);
        userInterface.start();
    }
}
