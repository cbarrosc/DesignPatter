package solid.singleresponsability.cumple;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;

public class Persistence {

    public void saveToFile(Journal journal, String file, boolean overwrite) throws FileNotFoundException {

        if(overwrite || new File(file).exists()){
            try (PrintStream out = new PrintStream(file)) {
                out.println(journal.toString());
            }
        }

    }

    public void load(String filename){}
    public void load(URL url){}


}
