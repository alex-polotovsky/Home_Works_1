package Calculator;

public class Calc {
    static double x;
    static double y;

    static int sum() {
        return (int) (x + y);
    }

    static int sub() {
        return (int) (x - y);
    }

    static int mult() {
        return (int) (x * y);
    }

    static double div() {
        return x / y;
    }
}
