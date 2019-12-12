package Person;

public class Person {
    private String name;
    private int age;
    private double wage;

    public Person(String name, int age, double wage) {
        this.name = name;
        this.age = age;
        this.wage = wage;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getWage() {
        return this.wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
}
