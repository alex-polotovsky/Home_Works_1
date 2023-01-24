package Calculator;

public class Controller {
    static void control() {
        Calc.x = View.inView();
        Calc.y = View.inView();
        String operator = View.operatorView();
        double res;
        switch (operator) {
            case "+":
                res = Calc.sum();
                break;
            case "-":
                res = Calc.sub();
                break;
            case "*":
                res = Calc.mult();
                break;
            case "/":
                res =Calc.div();
                break;

            default:
                res = 0.0;
                break;
        }
        View.outView(res);
    }
}
