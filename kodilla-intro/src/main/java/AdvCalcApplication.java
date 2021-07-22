public class AdvCalcApplication {

    private double circleArea;

    public double calculate() {
        String userSelected = UserDialogs.getUserSelection();
        int a = UserDialogs.getValue();
        int b = UserDialogs.getValue();
        double result = 0;
        switch (userSelected) {
            case "ADD":
                result = a + b;
                break;
            case "SUB":
                result = a - b;
                break;
            case "DIV":
                result =  a / b;
                break;
            case "MUL":
                result =  a * b;
            break;
        }
        return result;
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