package malvina_tsulukidze;
import malvina_tsulukidze.CalculatorService;
public class Main {
    public static void main(String[] args) {
        double a;
        double b;
        a=5;
        b=6;
        CalculatorService dsum= new CalculatorService();
        double c=dsum.sum(a,b);
        System.out.println(c);
        c=dsum.divide(a, b);
        System.out.println(c);

    }
}
