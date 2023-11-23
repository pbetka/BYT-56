package Calculator;

public class DivisionHandler implements OperationHandler {
    private OperationHandler nextHandler;

    @Override
    public void setNextHandler(OperationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(OperationRequest request) {
        if (request.getOperation().equalsIgnoreCase("/")) {
            if (request.getNumber2() != 0) {
                double result = request.getNumber1() / request.getNumber2();
                System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = " + result);
            } else {
                System.out.println(request.getNumber1() + " / "
                        + request.getNumber2() + " = !!! - Cannot divide by zero.");
            }
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}