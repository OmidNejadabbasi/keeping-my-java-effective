package item03;

public class StaticFactorySingleton {

    private static final StaticFactorySingleton instance = new StaticFactorySingleton();

    // field should be transient to not to be serialized
    public transient int field1;
    public transient int field2;

    public static StaticFactorySingleton getInstance(){
        return instance;
    }

    private StaticFactorySingleton(){
        if (instance != null) {
            throw new RuntimeException("The class is singleton, you can't cheat");
        }
    }

    // override this method to prevent creating new instance by deserializing
    private Object readResolve(){
        return instance;
    }

}
