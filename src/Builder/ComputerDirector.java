package Builder;

public class ComputerDirector {
    public void construct(ComputerBuilder builder, String cpu, String ram, String storage) {
        builder.buildCPU(cpu);
        builder.buildRAM(ram);
        builder.buildStorage(storage);
    }

    public void construct(ComputerBuilder builder, String cpu, String ram, String storage, String GPU) {
        builder.buildCPU(cpu);
        builder.buildRAM(ram);
        builder.buildStorage(storage);
        builder.buildGPU(GPU);
    }
}