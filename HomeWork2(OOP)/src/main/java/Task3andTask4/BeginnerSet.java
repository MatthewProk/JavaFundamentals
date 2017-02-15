package Task3andTask4;

import java.util.ArrayList;
import java.util.Collections;

public class BeginnerSet {

    public static void main(String[] args) {
        ArrayList<Stationery> beginnerSet = new ArrayList<Stationery>();
        Ballpen ballpen = new Ballpen("Kank", 811, "red");
        Gelpen gelpen = new Gelpen("Mank", 12, "blue");
        Eraser eraser = new Eraser("Allow", 135, "globe");
        Pencil pencil = new Pencil("Konki", 22, "green", "B");
        Eraser eraser1 = new Eraser("Kank", 773, "globe");
        Ballpen ballpen1 = new Ballpen("Ank", 112, "red");
        Gelpen gelpen1 = new Gelpen("Fank", 12, "red");
        beginnerSet.add(ballpen);
        beginnerSet.add(gelpen);
        beginnerSet.add(eraser);
        beginnerSet.add(pencil);
        beginnerSet.add(eraser1);
        beginnerSet.add(ballpen1);
        beginnerSet.add(gelpen1);
        Collections.sort(beginnerSet, new SortByPrice());
        System.out.println(beginnerSet);
        Collections.sort(beginnerSet, new SortByFirm());
        System.out.println(beginnerSet);
        Collections.sort(beginnerSet, new SortByWorthAndFirm());
        System.out.println(beginnerSet);
    }
}
