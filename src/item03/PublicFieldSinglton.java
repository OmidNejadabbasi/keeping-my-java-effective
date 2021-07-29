package item03;

import java.io.Serializable;

public class PublicFieldSinglton implements Serializable {

    public static final PublicFieldSinglton INSTANCE = new PublicFieldSinglton();

    // field should be transient to not to be serialized
    public transient int field1;
    public transient int field2;

    private PublicFieldSinglton() {
        if (INSTANCE != null) {
            throw new RuntimeException("The class is singleton, you can't cheat");
        }
    }

    // override this method to prevent creating new instance by deserializing
    private Object readResolve(){
        return INSTANCE;
    }

}
