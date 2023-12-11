package Builder;

public class DesktopBuilder implements ComputerBuilder {
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

    public void buildGPU(String gpu) {
        computer = new Computer(computer.getCpu(), computer.getRam(), computer.getStorage(), gpu);
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
