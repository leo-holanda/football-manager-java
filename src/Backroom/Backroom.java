package Backroom;

import Staff.*;
import java.util.HashMap;
import java.util.Random;

public class Backroom {
    HashMap<Integer, Staff> staff = new HashMap<Integer, Staff>();

    public void addStaff(Staff new_staff) {
        staff.put(generateRandomNumber(), new_staff);
    }

    public void deleteStaff(Integer id) {
        if (staff.containsKey(id)) {
            staff.remove(id);
        }
    }

    public void showStaff(int id) {
        if (staff.containsKey(id)) {
            staff.get(id).showStaff();
        }
    }

    public void showAllStaff() {
        for (Integer key : staff.keySet()) {
            System.out.print("ID : " + key + " | ");
            staff.get(key).showStaff();
        }
    }

    private Integer generateRandomNumber() {
        Random random = new Random();
        Integer random_value = random.nextInt(999);
        while (staff.containsKey(random_value)) {
            random_value = random.nextInt(999);
        }
        return random_value;
    }
}
