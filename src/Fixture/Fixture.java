package Fixture;

public class Fixture {
    private String opposition;
    private int date;
    private String stadium;

    public Fixture(String opposition, int date, String stadium) {
        this.opposition = opposition;
        this.date = date;
        this.stadium = stadium;
    }

    public String getOpposition() {
        return this.opposition;
    }

    public void setOpposition(String opposition) {
        this.opposition = opposition;
    }

    public int getDate() {
        return this.date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getStadium() {
        return this.stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }
}
