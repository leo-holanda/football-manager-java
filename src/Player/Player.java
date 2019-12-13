package Player;
import Contract.Contract;
import Person.*;

public class Player extends Person {
    private String position;
    private int goals;
    private int assists;
    private double value;

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

    public double getValue() {
        return this.value;
    }

    public void showPlayer() {
        System.out.println("Nome: " + this.getName());
        System.out.print("Idade: " + this.getAge() + " | ");
        System.out.print("Salario: " + this.getWage() + " | ");
        System.out.print("Tipo de contrato: " + this.getContractType() + " | ");
        System.out.print("Duracao de contrato: " + this.getContractLength() + " | ");
        System.out.print("Posicao: " + this.getPosition() + " | ");
        System.out.print("Gols: " + this.getGoals() + " | ");
        System.out.print("Assistencias: " + this.getAssists() + " | ");
        System.out.println("Valor de mercado: " + this.getValue());
    }
}
