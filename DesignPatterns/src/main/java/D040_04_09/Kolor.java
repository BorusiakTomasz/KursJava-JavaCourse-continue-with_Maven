package D040_04_09;

/**
 * Created by Miver on 2017-09-04.
 */
public enum Kolor {
    ZIELONY("z"), CZERWONY("c"), NIEBIESKI("n");
    private String code;

    Kolor(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
