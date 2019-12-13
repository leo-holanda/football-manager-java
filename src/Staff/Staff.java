package Staff;

import Contract.Contract;
import Person.*;

public class Staff extends Person {
    private String role;

    public Staff(String name, int age, Contract contract, String role) {
        super(name, age, contract);
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }

    public void showStaff() {
        System.out.println("Nome: " + this.getName());
        System.out.print("Idade: " + this.getAge() + " | ");
        System.out.print("Salario: " + this.getWage() + " | ");
        System.out.print("Tipo de contrato: " + this.getContractType() + " | ");
        System.out.print("Duracao de contrato: " + this.getContractLength() + " | ");
        System.out.println("Funcao: " + this.getRole());
        System.out.println();
    }
}
