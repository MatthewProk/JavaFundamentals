package Task3andTask4;

class Pencil extends Stationery {

    private String color;
    private String hardness;

    public String getColor() {
        return color;
    }

    Pencil(String firm, int worth, String color, String hardness) {
        super(firm, worth);
        this.color = color;
        this.hardness = hardness;
    }
}
