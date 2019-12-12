package Player;
import Person.*;

public class Player extends Person {
    private String position;
    private int goals;
    private int assists;
    private double value;

    public Player(String name, int age, double wage, String position) {
        super(name, age, wage);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public double getValue() {
        return value;
    }

    public void showPlayer() {
        System.out.println("Nome: " + this.getName());
        System.out.print("Idade: " + this.getAge() + " | ");
        System.out.print("Salario: " + this.getWage() + " | ");
        System.out.print("Posicao: " + this.getPosition() + " | ");
        System.out.print("Gols: " + this.getGoals() + " | ");
        System.out.print("Assistencias: " + this.getAssists() + " | ");
        System.out.println("Valor de mercado: " + this.getValue());
        System.out.println();
    }
}
