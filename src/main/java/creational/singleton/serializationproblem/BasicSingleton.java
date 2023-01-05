package creational.singleton.serializationproblem;

import java.io.Serializable;

public class BasicSingleton implements Serializable {

    private static final BasicSingleton INSTANCE = new BasicSingleton();

    public static BasicSingleton getInstance() {
        return INSTANCE;
    }

    private BasicSingleton() {
    }
    private int value = 0;

    public int getValue() {
        return value;
    }

    // implement readResolve method for use same instance when serialize
    protected Object readResolve() {
        return INSTANCE;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
