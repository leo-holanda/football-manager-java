package com.leonardo;
import com.leonardo.transfer.Transfer;
import com.leonardo.userinterface.*;
import com.leonardo.squad.*;
import com.leonardo.backroom.*;

public class Main {

    public static void main(String[] args) {
        Squad squad = new Squad();
        Backroom backroom = new Backroom();
        Transfer transfer = new Transfer();

        UserInterface userInterface = new UserInterface(squad, backroom, transfer);
        userInterface.start();
    }
}
