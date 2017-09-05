package D041_05_09.builder;

import org.junit.Test;

/**
 * Created by Miver on 2017-09-05.
 */
public class ComputerTest {
    @Test
    public void test() {
        StringBuilder builder = new StringBuilder();

        builder
                .append("Napis 1")
                .append("ala")
                .append("Ja");

        Computer mojKomputer =
                new Computer.ComputerBuilder()
                .addProcesor("Intel i5")
                .addMainboard("Asus H270")
                .addRam("8 GB")
                .addHdd("SSD 250 GB")
                .build();
    }

    @Test
    public void builderTest() {
        Computer.ComputerBuilder builder = new Computer.ComputerBuilder();
        builder.addMainboard("Asus b150");
        builder.addRam("8 GB DDR4 2133");

        Computer build = builder.build();
    }
}