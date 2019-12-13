package Staff;

import Contract.Contract;
import Person.*;

public class Staff extends Person {
    private String role;
    private String qualification;

    public Staff(String name, int age, Contract contract, String role, String qualification) {
        super(name, age, contract);
        this.role = role;
        this.qualification = qualification;
    }

    public String getRole() {
        return this.role;
    }

    public String getQualification() { return qualification; }

    public void showStaff() {
        System.out.println("Nome: " + this.getName());
        System.out.print("Idade: " + this.getAge() + " | ");
        System.out.print("Salario: " + this.getWage() + " | ");
        System.out.print("Tipo de contrato: " + this.getContractType() + " | ");
        System.out.print("Duracao de contrato: " + this.getContractLength() + " | ");
        System.out.print("Funcao: " + this.getRole() + " | ");
        System.out.println("Qualificacao: " + this.getQualification());
    }
}
