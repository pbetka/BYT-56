package Builder;

public class BuilderClient {
    public static void main(String[] args) {
        ComputerBuilder desktopBuilder = new DesktopBuilder();
        ComputerBuilder laptopBuilder = new LaptopBuilder();
        ComputerDirector director = new ComputerDirector();

        director.construct(desktopBuilder, "Intel i7", "32GB", "1TB HDD", "NVIDIA RTX 3080");
        Computer desktop = desktopBuilder.getResult();
        System.out.println("Desktop Computer: " +
                "CPU: " + desktop.getCpu() +
                ", RAM: " + desktop.getRam() +
                ", Storage: " + desktop.getStorage() +
                ", GPU: " + desktop.getGpu());

        director.construct(laptopBuilder, "AMD Ryzen 9", "64GB", "2TB SSD");
        Computer laptop = laptopBuilder.getResult();
        System.out.println("Laptop Computer: " +
                "CPU: " + laptop.getCpu() +
                ", RAM: " + laptop.getRam() +
                ", Storage: " + laptop.getStorage());
    }
}