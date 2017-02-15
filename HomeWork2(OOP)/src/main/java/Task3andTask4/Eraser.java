package Task3andTask4;

public class Eraser extends Stationery{

    private String shape;

    Eraser(String firm, int worth, String shape) {
        super(firm, worth);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }


}
