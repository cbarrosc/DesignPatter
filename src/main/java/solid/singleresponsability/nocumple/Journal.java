package solid.singleresponsability.nocumple;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

//ejemplo de clase que no cumple con el principio de responsabilidad unica
public class Journal {
    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text){
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index){
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

    //persistimos data en un archivo
    public void save(String filename) throws FileNotFoundException{
        try (PrintStream out = new PrintStream(filename)){
            out.println(toString());
        }
    }

    public void load(String filename) {}
    public void load(URL url) {}


}
