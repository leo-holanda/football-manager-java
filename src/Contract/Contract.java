package Contract;

public class Contract {
    private int length;
    private String type;
    private double wage;

    public Contract(int length, String type, double wage) {
        this.length = length;
        this.type = type;
        this.wage = wage;
    }

    public int getLength() {
        return this.length;
    }

    public String getType() {
        return this.type;
    }

    public double getWage() {
        return this.wage;
    }
}
