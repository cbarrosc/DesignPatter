package solid.singleresponsability;

import solid.singleresponsability.cumple.Journal;
import solid.singleresponsability.cumple.Persistence;

public class Demo {
    public static void main(String[] args) throws Exception {
        Journal j = new Journal();
        j.addEntry("I cried today");
        j.addEntry("I ate a bug");
        System.out.println(j);

        Persistence p = new Persistence();
        String filename = "/temp/jounal.txt";
        p.saveToFile(j, filename, true);

    }
}
