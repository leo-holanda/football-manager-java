package Backroom;

import Person.Person;
import Staff.*;
import java.util.HashMap;
import java.util.Random;
import Action.*;

public class Backroom implements Action<Staff>{
    HashMap<Integer, Staff> staff = new HashMap<Integer, Staff>();

    @Override
    public void add(Staff new_staff) {
        staff.put(generateRandomNumber(), new_staff);
    }

    @Override
    public void delete(int id) {
        if (staff.containsKey(id)) {
            staff.remove(id);
            System.out.println("O staff foi removido com sucesso!");
        }
        else {
            System.out.println("O staff nao foi encontrado!");
        }
    }

    @Override
    public void show(int id) {
        if (staff.containsKey(id)) {
            staff.get(id).showStaff();
        }
        else {
            System.out.println("O staff nao foi encontrado!");
        }
    }

    @Override
    public void showAll() {
        System.out.println();
        for (Integer key : staff.keySet()) {
            System.out.print("ID : " + key + " | ");
            staff.get(key).showStaff();
        }
    }

    @Override
    public Staff get(int id) {
        return staff.get(id);
    }

    @Override
    public Person searchByName(String name) {
        for (Person person : staff.values()) {
            if (person.getName().contains(name)){
                return person;
            }
        }

        return null;
    }

    private int generateRandomNumber() {
        Random random = new Random();
        int random_value = random.nextInt(999);
        while (staff.containsKey(random_value)) {
            random_value = random.nextInt(999);
        }
        return random_value;
    }
}
