package Calculator;

import java.util.Scanner;

public class Calculator {
    private OperationHandler chain;

    public Calculator() {
        OperationHandler additionHandler = new AdditionHandler();
        OperationHandler subtractionHandler = new SubtractionHandler();
        OperationHandler multiplicationHandler = new MultiplicationHandler();
        OperationHandler divisionHandler = new DivisionHandler();

        additionHandler.setNextHandler(subtractionHandler);
        subtractionHandler.setNextHandler(multiplicationHandler);
        multiplicationHandler.setNextHandler(divisionHandler);

        this.chain = additionHandler;
    }

    public void performOperation(double number1, double number2, String operation) {
        OperationRequest request = new OperationRequest(number1, number2, operation);
        chain.handleRequest(request);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.performOperation(5, 3, "+");
        calculator.performOperation(5, 3, "-");
        calculator.performOperation(5, 3, "*");
        calculator.performOperation(5, 0, "/");
    }
}