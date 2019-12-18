package com.leonardo.player;
import com.leonardo.contract.Contract;
import com.leonardo.person.*;

public class Player extends Person {
    private String position;
    private int goals;
    private int assists;

    public Player(String name, int age, Contract contract, String position) {
        super(name, age, contract);
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }

    public int getGoals() {
        return this.goals;
    }

    public int getAssists() {
        return this.assists;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public void showPlayer() {
        System.out.println("Nome: " + this.getName());
        System.out.print("Idade: " + this.getAge() + " | ");
        System.out.print("Salario: " + this.getContract().getWage() + " | ");
        System.out.print("Tipo de contrato: " + this.getContract().getType() + " | ");
        System.out.print("Duracao de contrato: " + this.getContract().getLength() + " | ");
        System.out.print("Posicao: " + this.getPosition() + " | ");
        System.out.print("Gols: " + this.getGoals() + " | ");
        System.out.println("Assistencias: " + this.getAssists());
    }
}
