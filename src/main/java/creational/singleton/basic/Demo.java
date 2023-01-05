package creational.singleton.basic;

public class Demo {
    public static void main(String[] args) {
        BasicSingleton singleton = BasicSingleton.getInstance();
        singleton.setValue(111);
        System.out.println(singleton.getValue());

        BasicSingleton singleton2 = BasicSingleton.getInstance();
        System.out.println(singleton2.getValue());
    }
}
