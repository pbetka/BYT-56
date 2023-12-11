package Builder;

public interface ComputerBuilder {
    void buildCPU(String cpu);
    void buildRAM(String ram);
    void buildStorage(String storage);
    void buildGPU(String gpu);
    Computer getResult();
}
