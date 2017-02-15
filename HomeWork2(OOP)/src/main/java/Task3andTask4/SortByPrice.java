package Task3andTask4;

import java.util.Comparator;

class SortByPrice implements Comparator<Stationery> {

    public int compare(Stationery obj1, Stationery obj2) {

        if (obj1.getWorth() > obj2.getWorth()) {
            return 1;
        } else if (obj1.getWorth() < obj2.getWorth()) {
            return -1;
        } else {
            return 0;
        }
    }
}
