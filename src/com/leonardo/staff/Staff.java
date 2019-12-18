package com.leonardo.staff;

import com.leonardo.contract.Contract;
import com.leonardo.person.*;

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

    public void setRole(String role) { this.role = role; }

    public void setQualification(String qualification) { this.qualification = qualification; }

    public void showStaff() {
        System.out.println("Nome: " + this.getName());
        System.out.print("Idade: " + this.getAge() + " | ");
        System.out.print("Salario: " + this.getContract().getWage() + " | ");
        System.out.print("Tipo de contrato: " + this.getContract().getType() + " | ");
        System.out.print("Duracao de contrato: " + this.getContract().getLength() + " | ");
        System.out.print("Funcao: " + this.getRole() + " | ");
        System.out.println("Qualificacao: " + this.getQualification());
    }
}
