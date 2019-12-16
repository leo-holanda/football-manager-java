package com.leonardo;
import Schedule.Schedule;
import UserInterface.*;
import Squad.*;
import Backroom.*;

public class Main {

    public static void main(String[] args) {
        Squad squad = new Squad();
        Backroom backroom = new Backroom();
        Schedule schedule = new Schedule();

        UserInterface userInterface = new UserInterface(squad, backroom, schedule);
        userInterface.start();
    }
}
