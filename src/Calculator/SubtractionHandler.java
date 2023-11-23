package Calculator;

public class SubtractionHandler implements OperationHandler {
    private OperationHandler nextHandler;

    @Override
    public void setNextHandler(OperationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(OperationRequest request) {
        if (request.getOperation().equalsIgnoreCase("-")) {
            double result = request.getNumber1() - request.getNumber2();
            System.out.println(request.getNumber1() + " - " + request.getNumber2() + " = " + result);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
