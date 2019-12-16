package Schedule;

import Fixture.Fixture;

import java.util.LinkedList;

public class Schedule {
    LinkedList<Fixture> fixtures = new LinkedList<Fixture>();

    public void showAll(){
        for (Fixture fixture : fixtures){
            fixture.show();
        }
    }

    public Object find(int date){
        for (Fixture fixture : fixtures){
            if (fixture.getDate() == date){
                return fixture;
            }
        }
        return false;
    }
}

