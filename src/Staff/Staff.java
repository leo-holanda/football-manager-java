package Staff;

import Person.*;

public class Staff extends Person {
    private String role;


    public Staff(String name, int age, double wage, String role) {
        super(name, age, wage);
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
