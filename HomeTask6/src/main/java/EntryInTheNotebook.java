

class EntryInTheNotebook  {

    private int recordLength;
    private String color;

    EntryInTheNotebook(int length, String color){
        this.recordLength = length;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Строка состоит из " + recordLength +
                "символов. Цвет строки: " + color;
    }

    /**
     * This method correct the selected entry in the notebook
     */
    void correctRecord(int changeLength, String color){
        this.recordLength = changeLength;
        this.color = color;
    }


}
