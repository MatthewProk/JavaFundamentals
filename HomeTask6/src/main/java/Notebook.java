import java.util.ArrayList;

public class Notebook {

    public static void main(String[] args) {
        ArrayList<EntryInTheNotebook> notebook = new ArrayList<EntryInTheNotebook>();
        Notebook nb = new Notebook();
        EntryInTheNotebook record1 = new EntryInTheNotebook(10, "red");
        EntryInTheNotebook record2 = new EntryInTheNotebook(11, "black");
        EntryInTheNotebook record3 = new EntryInTheNotebook(12, "blue");
        nb.addRecord(notebook, record1);
        nb.addRecord(notebook, record2);
        nb.addRecord(notebook, record3);
        nb.removeRecord(notebook, record1);
        nb.viewRecord(notebook);
        record2.correctRecord(15, "orange");
        System.out.println();
        nb.viewRecord(notebook);

    }

    /**
     * This method adds the selected entry in the notebook
     */
    private void addRecord(ArrayList<EntryInTheNotebook> arr, EntryInTheNotebook record){
        arr.add(record);
    }
    /**
     * This method removes the selected entry in the notebook
     */
    private void removeRecord(ArrayList<EntryInTheNotebook> arr, EntryInTheNotebook record){
        arr.remove(record);
    }
    /**
     * This method allows you to view all the records in the notebook
     */
    private void viewRecord(ArrayList<EntryInTheNotebook> arr){
        for (EntryInTheNotebook note:arr){
            System.out.println(note.toString());
        }
    }



}
