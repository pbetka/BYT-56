package Builder;

public class LaptopBuilder implements ComputerBuilder {
    private Computer computer = new Computer("Default CPU", "Default RAM", "Default Storage");

    @Override
    public void buildCPU(String cpu) {
        computer = new Computer(cpu, computer.getRam(), computer.getStorage());
    }

    @Override
    public void buildRAM(String ram) {
        computer = new Computer(computer.getCpu(), ram, computer.getStorage());
    }

    @Override
    public void buildStorage(String storage) {
        computer = new Computer(computer.getCpu(), computer.getRam(), storage);
    }

    @Override
    public void buildGPU(String gpu) {

    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
