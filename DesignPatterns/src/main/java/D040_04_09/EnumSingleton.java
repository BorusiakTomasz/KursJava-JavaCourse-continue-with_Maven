package D040_04_09;

/**
 * Created by Miver on 2017-09-04.
 */
public enum EnumSingleton {
    INSTANCE; // added name of the (single) instance

    private int id;
    private String name;

    EnumSingleton() {} // removed "public"

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }
}
