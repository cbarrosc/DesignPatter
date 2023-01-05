package creational.singleton.blocksingleton;

import java.io.File;
import java.io.IOException;

public class StaticBlocSingleton {

    private StaticBlocSingleton() throws IOException {
        System.out.println("Singleton is initializing");
        File.createTempFile(".", ".");
    }

    private static StaticBlocSingleton instance;

    static {
        try {
            instance = new StaticBlocSingleton();
        } catch (IOException e) {
            System.err.println("Failed to create singleton");
        }
    }

    public static StaticBlocSingleton getInstance() {
        return instance;
    }
}
