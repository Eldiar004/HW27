import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sqrt(sc.nextDouble()));

    }
    public static double sqrt(double unary){
        UnaryOperator<Double> unaryOperator = x ->Math.sqrt(x);
        return unaryOperator.apply(unary);
    }
}