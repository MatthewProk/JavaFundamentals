package Task3andTask4;

class Stationery {

    private String firm;
    private int worth;

    String getFirm() {
        return firm;
    }

    int getWorth() {
        return worth;
    }

    Stationery(String firm, int worth) {

        this.firm = firm;
        this.worth = worth;
    }

    @Override
    public String toString() {
        return "Фирма товара: " + firm + ", стоимость товара: " + worth;
    }
}
