public class AdvCalcApplication {

    private double circleArea;

    public double calculate() {
        String userSelected = UserDialogs.getUserSelection();
        int a = UserDialogs.getValue();
        int b = UserDialogs.getValue();
        switch (userSelected) {
            case "ADD":
                return a + b;
            case "SUB":
                return a - b;
            case "DIV":
                return a / b;
            case "MUL":
                return a * b;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {

        AdvCalcApplication calculator = new AdvCalcApplication();
        double result = calculator.calculate();
        System.out.println("Result: " + result);

        double area = calculator.circleArea;
        System.out.println("Area of the circle with radius 10 equals: " + area);

        double p = Calculator.PI;
        System.out.println("The value of a pi constant is equals: " + p);

        Calculator calculator2 = new Calculator();
        System.out.println(calculator2.counter);
    }
}