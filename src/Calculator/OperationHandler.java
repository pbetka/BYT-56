package Calculator;

public interface OperationHandler {
    void setNextHandler(OperationHandler nextHandler);
    void handleRequest(OperationRequest request);
}
