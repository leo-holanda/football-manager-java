package Person;

import Contract.*;

public class Person {
    private String name;
    private int age;
    private Contract contract;

    public Person(String name, int age, Contract contract) {
        this.name = name;
        this.age = age;
        this.contract = contract;
    }

    public String getName() { return this.name; }

    public int getAge() {
        return this.age;
    }

    public Contract getContract() {
        return this.contract;
    }

    public double getWage() { return this.getContract().getWage(); }

    public String getContractType() {return this.getContract().getType(); }

    public int getContractLength() {return this.getContract().getLength(); }
}
