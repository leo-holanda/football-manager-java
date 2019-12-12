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

    public void showStaff() {
        System.out.println("Nome: " + this.getName());
        System.out.print("Idade: " + this.getAge() + " | ");
        System.out.print("Salario: " + this.getWage() + " | ");
        System.out.println("Funcao: " + this.getRole() + " | ");
        System.out.println();
    }
}
