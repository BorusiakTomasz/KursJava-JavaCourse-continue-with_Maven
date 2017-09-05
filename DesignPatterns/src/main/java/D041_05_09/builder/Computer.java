package D041_05_09.builder;

import lombok.*;

/**
 * Created by Miver on 2017-09-05.
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Computer {
    private String procesor;
    private String ram;
    private String hdd;
    private String mainboard;

    public static class ComputerBuilder {
        private String procesor;
        private String ram;
        private String hdd;
        private String mainboard;

        public ComputerBuilder() {
        }

        public ComputerBuilder addProcesor(String procesor) {
            this.procesor = procesor;
            return this;
        }

        public ComputerBuilder addRam(String ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder addHdd(String hdd) {
            this.hdd = hdd;
            return this;
        }

        public ComputerBuilder addMainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }

        public Computer build() {
            return new Computer(procesor, ram, hdd, mainboard);
        }
    }
}
