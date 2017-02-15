package Task2;

public class Tool {

    private String name;
    private double worth;

    Tool(String name, double worth){
        this.name = name;
        this.setWorth(worth);
    }

    public double getWorth() {
        return worth;
    }

    private void setWorth(double worth) {
        this.worth = worth;
    }

}
